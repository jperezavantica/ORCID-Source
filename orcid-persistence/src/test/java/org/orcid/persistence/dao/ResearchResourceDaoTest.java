package org.orcid.persistence.dao;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.orcid.persistence.jpa.entities.EndDateEntity;
import org.orcid.persistence.jpa.entities.ResearchResourceEntity;
import org.orcid.persistence.jpa.entities.ResearchResourceItemEntity;
import org.orcid.persistence.jpa.entities.StartDateEntity;
import org.orcid.test.DBUnitTest;
import org.orcid.test.OrcidJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;

import com.google.common.collect.Sets;

@RunWith(OrcidJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:orcid-persistence-context.xml" })
public class ResearchResourceDaoTest extends DBUnitTest{
    
    @Resource(name = "researchResourceDao")
    private ResearchResourceDao dao;

    @Resource(name = "profileDao")
    private ProfileDao pDao;

    private static String USER_ORCID = "0000-0000-0000-0003";
    private static String OTHER_USER_ORCID = "4444-4444-4444-4446";
    
    @BeforeClass
    public static void initDBUnitData() throws Exception {
        initDBUnitData(Arrays.asList("/data/SecurityQuestionEntityData.xml", "/data/SourceClientDetailsEntityData.xml", "/data/ProfileEntityData.xml",
                "/data/OrgsEntityData.xml", "/data/ResearchResourceEntityData.xml"));
    }

    @AfterClass
    public static void removeDBUnitData() throws Exception {
        removeDBUnitData(Arrays.asList("ResearchResourceEntityData.xml", "/data/OrgsEntityData.xml", "/data/ProfileEntityData.xml", "/data/SourceClientDetailsEntityData.xml", "/data/SecurityQuestionEntityData.xml"));
    }

    @Test
    public void testRead(){
        List<ResearchResourceEntity> e1 = dao.getByUser(OTHER_USER_ORCID, new Date().getTime());
        assertNotNull(e1);
        assertEquals(3,e1.size());
        //first
        assertEquals(1l,e1.get(0).getDisplayIndex().longValue());
        assertEquals("the title",e1.get(0).getTitle());
        assertEquals("the translated title",e1.get(0).getTranslatedTitle());
        assertEquals("EN",e1.get(0).getTranslatedTitleLanguageCode());
        assertEquals("the proposal type",e1.get(0).getProposalType());
        assertEquals("the url",e1.get(0).getUrl());
        assertEquals("PUBLIC",e1.get(0).getVisibility());
        assertEquals(2010,e1.get(0).getStartDate().getYear().intValue());
        assertEquals(7,e1.get(0).getStartDate().getMonth().intValue());
        assertEquals(2,e1.get(0).getStartDate().getDay().intValue());
        assertEquals(2011,e1.get(0).getEndDate().getYear().intValue());
        assertEquals(7,e1.get(0).getEndDate().getMonth().intValue());
        assertEquals(2,e1.get(0).getEndDate().getDay().intValue());
        assertEquals(Date.parse("2010/07/02 15:31"),e1.get(0).getDateCreated().getTime());
        assertEquals(Date.parse("2010/07/02 15:31"),e1.get(0).getLastModified().getTime());
        assertEquals("4444-4444-4444-4446",e1.get(0).getProfile().getUsername());
        assertEquals("4444-4444-4444-4442",e1.get(0).getSourceId());
        assertEquals(0,e1.get(0).getResourceItems().size());
        //other two
        assertEquals(2l,e1.get(1).getDisplayIndex().longValue());
        assertEquals(3l,e1.get(2).getDisplayIndex().longValue());
    }
    
    @Test
    public void testWrite(){
        ResearchResourceEntity e = new ResearchResourceEntity();
        e.setDisplayIndex(4l);
        e.setTitle("the title4");
        e.setTranslatedTitle("the translated title4");
        e.setTranslatedTitleLanguageCode("DE");
        e.setProposalType("the proposal type4");
        e.setUrl("the url4");
        e.setVisibility("PRIVATE");
        StartDateEntity se = new StartDateEntity();
        se.setDay(1);
        se.setMonth(2);
        se.setYear(2003);
        e.setStartDate(se);
        EndDateEntity ee = new EndDateEntity();
        ee.setDay(1);
        ee.setMonth(2);
        ee.setYear(2003);
        e.setEndDate(ee);
        Date d = new Date(Date.parse("2010/07/02 15:31"));
        e.setDateCreated(d);
        e.setLastModified(d);
        e.setClientSourceId("4444-4444-4444-4442");
        e.setExternalIdentifiersJson("{&quot;workExternalIdentifier&quot;:[{&quot;workExternalIdentifierType&quot;:&quot;AGR&quot;,&quot;workExternalIdentifierId&quot;:{&quot;content&quot;:&quot;work:external-identifier-id#1&quot;}}]}");
        e.setProfile(pDao.find(USER_ORCID));
        
        dao.persist(e);
        e.setVisibility("PUBLIC");
        dao.flush();
        
        List<ResearchResourceEntity> e1 = dao.getByUser(USER_ORCID, new Date().getTime());
        assertNotNull(e1);
        assertEquals(2,e1.size());

        assertEquals(4l,e1.get(1).getDisplayIndex().longValue());
        assertEquals("the title4",e1.get(1).getTitle());
        assertEquals("the translated title4",e1.get(1).getTranslatedTitle());
        assertEquals("DE",e1.get(1).getTranslatedTitleLanguageCode());
        assertEquals("the proposal type4",e1.get(1).getProposalType());
        assertEquals("the url4",e1.get(1).getUrl());
        assertEquals("PRIVATE",e1.get(1).getVisibility());
        assertEquals(2003,e1.get(1).getStartDate().getYear().intValue());
        assertEquals(2,e1.get(1).getStartDate().getMonth().intValue());
        assertEquals(1,e1.get(1).getStartDate().getDay().intValue());
        assertEquals(2003,e1.get(1).getEndDate().getYear().intValue());
        assertEquals(2,e1.get(1).getEndDate().getMonth().intValue());
        assertEquals(1,e1.get(1).getEndDate().getDay().intValue());
        assertEquals(Date.parse("2010/07/02 15:31"),e1.get(1).getDateCreated().getTime());
        assertNotNull(e1.get(1).getLastModified().getTime());
        assertEquals(USER_ORCID,e1.get(1).getProfile().getUsername());
        assertEquals("4444-4444-4444-4442",e1.get(1).getClientSourceId());
        assertEquals("{&quot;workExternalIdentifier&quot;:[{&quot;workExternalIdentifierType&quot;:&quot;AGR&quot;,&quot;workExternalIdentifierId&quot;:{&quot;content&quot;:&quot;work:external-identifier-id#1&quot;}}]}",e.getExternalIdentifiersJson());
        
        ResearchResourceItemEntity ei = new ResearchResourceItemEntity();
        ei.setExternalIdentifiersJson("{&quot;workExternalIdentifier&quot;:[{&quot;workExternalIdentifierType&quot;:&quot;AGR&quot;,&quot;workExternalIdentifierId&quot;:{&quot;content&quot;:&quot;work:external-identifier-id#1&quot;}}]}");
        ei.setResourceName("the resource name");
        ei.setResourceType("the resource type");
        ei.setUrl("the resource url");
        //are these needed?  Will one do?  er...
        ei.setResearchResourceEntity(e);
        //ei.setResearchResourceId(e.getId());
        
        e1.get(1).setResourceItems( Sets.newHashSet(ei));
        ResearchResourceEntity eiMerged = dao.merge(e1.get(1));
        assertEquals("the resource name",eiMerged.getResourceItems().iterator().next().getResourceName());

    }


}

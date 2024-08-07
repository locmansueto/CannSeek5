package org.irri.iric.portal.dao;

import java.math.BigDecimal;

import java.util.Map;

import org.irri.iric.portal.domain.MultiReferenceLocus;
import org.irri.iric.portal.domain.MultiReferenceConversion;

import org.irri.iric.portal.genotype.VariantStringData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Implementation of MultipleReferenceConverterDAO
 * 
 * @author LMansueto
 *
 */
@Repository("MultipleReferenceConverterDAOImpl")
public class MultipleReferenceConverterDAOImpl implements MultipleReferenceConverterDAO {

	@Autowired
	@Qualifier("OrganismDAO")
	private OrganismDAO organismdao;

	private Map<String, BigDecimal> mapOrgname2Id = null;

	//
	//
	// private BigDecimal getOrganismId(String organism) {
	// if(mapOrgname2Id==null) {
	// mapOrgname2Id = new HashMap();
	// organismdao = (OrganismDAO)AppContext.checkBean(organismdao, "OrganismDAO");
	// Iterator<Organism> itOrgs = organismdao.getOrganisms().iterator();
	// while(itOrgs.hasNext()) {
	// Organism org = itOrgs.next();
	// mapOrgname2Id.put(org.getName(), org.getOrganismId());
	// }
	// }
	// return mapOrgname2Id.get(organism);
	// }
	//
	//
	@Override
	public MultiReferenceConversion convertPosition(MultiReferenceConversion fromPos, String toReference,
			String toContig) {
		return null;
	}

	@Override
	public MultiReferenceLocus convertLocus(MultiReferenceLocus fromLocus, String toReference, String toContig) {
		return null;
	}

	@Override
	public VariantStringData convertReferencePositions(VariantStringData variantstringdataNPB,
			MultiReferenceLocus npbMultirefLocus, MultiReferenceLocus origMultiReferenceLocus, String toContig,
			boolean isOtherRefs) throws Exception {
		return null;
	}

}

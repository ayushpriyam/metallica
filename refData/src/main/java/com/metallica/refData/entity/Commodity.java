/**
 * 
 */
package com.metallica.refData.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ayupriya
 *
 */
public class Commodity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int commodityId;
	private String commodityName;

	/**
	 * @param commodityName
	 */
	public Commodity(String commodityName) {
		this.commodityName = commodityName;
	}

	/**
	 * @return the commodityName
	 */
	public String getCommodityName() {
		return commodityName;
	}

	/**
	 * @param commodityName the commodityName to set
	 */
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	/**
	 * @return the commodityId
	 */
	public int getCommodityId() {
		return commodityId;
	}

	@Override
	public String toString() {
		return "Commodity [commodityId=" + commodityId + ", commodityName=" + commodityName + "]";
	}

}

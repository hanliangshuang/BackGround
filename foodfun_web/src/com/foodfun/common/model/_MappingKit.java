package com.foodfun.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("classify", "classifyId", Classify.class);
		arp.addMapping("collect", "collectId", Collect.class);
		arp.addMapping("commend", "commendId", Commend.class);
		arp.addMapping("fun", "funId", Fun.class);
		arp.addMapping("mclassify", "mclassifyId", Mclassify.class);
		arp.addMapping("openuser", "id", Openuser.class);
		arp.addMapping("recipes", "recipesId", Recipes.class);
		arp.addMapping("test", "id", Test.class);
		arp.addMapping("user", "userId", User.class);
	}
}


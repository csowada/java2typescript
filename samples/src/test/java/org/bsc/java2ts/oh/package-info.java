/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
@Java2TS(declare = {

	@Type(java.util.Locale.class),
	@Type(java.math.BigDecimal.class),

	@Type(org.openhab.core.common.registry.Identifiable.class),

	@Type(org.openhab.core.config.core.ConfigDescriptionParameter.class),

	// @Type(org.openhab.core.items.Item.class),
	@Type(org.openhab.core.items.GenericItem.class),
	@Type(org.openhab.core.items.StateChangeListener.class),
	@Type(org.openhab.core.items.ItemStateConverter.class),

	@Type(org.openhab.core.items.events.ItemStateChangedEvent.class),
	@Type(org.openhab.core.items.events.ItemCommandEvent.class),
	@Type(org.openhab.core.items.events.ItemStatePredictedEvent.class),
	@Type(org.openhab.core.items.events.GroupItemStateChangedEvent.class),
	@Type(org.openhab.core.items.events.ItemEvent.class),
	@Type(org.openhab.core.items.events.ItemStatePredictedEvent.class),
	// @Type(value=org.openhab.core.items.ItemRegistry.class, export = true),
	// @Type(value=org.openhab.core.automation.module.script.internal.defaultscope.ScriptBusEvent.class, export = true),

	@Type(org.openhab.core.types.Command.class),
	@Type(org.openhab.core.types.CommandDescription.class),
	@Type(org.openhab.core.types.CommandDescriptionBuilder.class),
	@Type(org.openhab.core.types.CommandDescriptionProvider.class),
	@Type(org.openhab.core.types.CommandOption.class),
	@Type(org.openhab.core.types.ComplexType.class),
	@Type(org.openhab.core.types.EventDescription.class),
	@Type(org.openhab.core.types.EventOption.class),
	@Type(org.openhab.core.types.PrimitiveType.class),
	@Type(org.openhab.core.types.RefreshType.class),
	// @Type(value=org.openhab.core.types.State.class),
	@Type(org.openhab.core.types.StateDescription.class),
	@Type(org.openhab.core.types.StateDescriptionFragment.class),
	@Type(org.openhab.core.types.StateOption.class),
	@Type(value=org.openhab.core.types.Type.class),
	@Type(org.openhab.core.types.TypeParser.class),
	@Type(org.openhab.core.types.UnDefType.class),
	@Type(org.openhab.core.service.StateDescriptionService.class),
	
	@Type(org.openhab.core.automation.Action.class),
	@Type(org.openhab.core.automation.Condition.class),
	@Type(org.openhab.core.automation.Module.class),
	@Type(org.openhab.core.automation.Trigger.class),
	@Type(org.openhab.core.automation.Visibility.class),
	// @Type(org.openhab.core.automation.Rule.class),
	@Type(org.openhab.core.automation.RuleManager.class),



	@Type(org.openhab.core.library.types.ArithmeticGroupFunction.class),
	@Type(org.openhab.core.library.types.DateTimeGroupFunction.class),
	@Type(org.openhab.core.library.types.DateTimeType.class),
	@Type(org.openhab.core.library.types.DecimalType.class),
	@Type(value=org.openhab.core.library.types.HSBType.class, export = true),
	@Type(org.openhab.core.library.types.IncreaseDecreaseType.class),
	@Type(org.openhab.core.library.types.NextPreviousType.class),
	@Type(org.openhab.core.library.types.OnOffType.class),
	@Type(org.openhab.core.library.types.OpenClosedType.class),
	@Type(org.openhab.core.library.types.PercentType.class),
	@Type(org.openhab.core.library.types.PlayPauseType.class),
	@Type(org.openhab.core.library.types.PointType.class),
	// @Type(org.openhab.core.library.types.QuantityType.class),
	@Type(org.openhab.core.library.types.QuantityTypeArithmeticGroupFunction.class),
	@Type(org.openhab.core.library.types.RawType.class),
	@Type(org.openhab.core.library.types.RewindFastforwardType.class),
	@Type(org.openhab.core.library.types.StopMoveType.class),
	@Type(org.openhab.core.library.types.StringListType.class),
	@Type(org.openhab.core.library.types.StringType.class),
	@Type(org.openhab.core.library.types.UpDownType.class),

	@Type(org.openhab.core.automation.module.script.rulesupport.shared.ScriptedAutomationManager.class),

	// @Type(org.openhab.core.automation.util.ConfigurationNormalizer.class),
	// @Type(org.openhab.core.automation.util.ReferenceResolver.class),

	// Already transfered!!!
	// @Type(value=org.openhab.core.automation.util.ModuleBuilder.class, export = true, includeSuper = true, nodts = true),
	// @Type(value=org.openhab.core.automation.util.ModuleBuilder.class, export = true),
	// @Type(value=org.openhab.core.automation.util.TriggerBuilder.class, export = true),
	// @Type(value=org.openhab.core.automation.util.ActionBuilder.class, export = true),
	// @Type(value=org.openhab.core.automation.util.ConditionBuilder.class, export = true),

	// @Type(value=org.openhab.core.config.core.Configuration.class, export = true),
	// @Type(value=org.openhab.core.automation.module.script.rulesupport.shared.simple.SimpleRule.class, export = true),
	// @Type(value=org.openhab.core.automation.module.script.rulesupport.shared.simple.SimpleRuleActionHandler.class, functional = true),

})
package org.bsc.java2ts.oh;


import org.bsc.processor.annotation.Java2TS;
import org.bsc.processor.annotation.Type;

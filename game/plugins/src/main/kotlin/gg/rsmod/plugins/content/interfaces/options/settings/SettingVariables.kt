package gg.rsmod.plugins.content.interfaces.options.settings

import gg.rsmod.game.Server.Companion.logger
import gg.rsmod.game.model.entity.Player
import gg.rsmod.plugins.api.cfg.SettingStructs
import gg.rsmod.plugins.api.ext.getVarbit
import gg.rsmod.plugins.api.ext.getVarp
import gg.rsmod.plugins.api.ext.setVarbit
import gg.rsmod.plugins.api.ext.setVarp

object SettingVariables {
      val HIGHLIGHT_ENTITIES_ON_MOUSEOVER_VARBIT_ID = 13088
      val HIGHLIGHT_AGILITY_SHORTCUTS_SHORTCUT_REQUIREMENTS_VARBIT_ID = 13136
      val BIRD_NEST_NOTIFICATION_VARBIT_ID = 13087
      val SLAYER_HELPER_VARBIT_ID = 13082
      val IRON_LOOT_RESTRICTION_INDICATOR_VARBIT_ID = 13039
      val IRON_LOOT_RESTRICTION_MESSAGES_VARBIT_ID = 13040
      val HIGHLIGHT_ENTITIES_ON_TAP_VARBIT_ID = 13666
      val VIBRATE_ON_INTERACTION_VARBIT_ID = 13831
      val VIBRATE_WHEN_MINIMENU_OPENS_VARBIT_ID = 13833
      val VIBRATE_ON_DRAG_VARBIT_ID = 13832
      val VIBRATE_WHEN_HOVERING_OVER_MINIMENU_ENTRIES_VARBIT_ID = 13834
      val PK_SKULL_PREVENTION_VARBIT_ID = 13131
      val ANTI_DRAG_VARBIT_ID = 12345
      val EXAMINE_PRICE_INFO_GRAND_EXCHANGE_VARBIT_ID = 13826
      val CHATBOX_MODE_SET_AUTOMATICALLY_VARBIT_ID = 13120
      val EXAMINE_PRICE_INFO_ALCHEMY_VARBIT_ID = 13827
      val LOGOUT_NOTIFIER_VARBIT_ID = 13083
      val HIDE_UNAVAILABLE_QUESTS_VARBIT_ID = 13890
      val POISON_DAMAGE_VARBIT_ID = 13084
      val HIDE_QUESTS_VARBIT_ID = 13774
      val HIDE_MINIQUESTS_VARBIT_ID = 13773
      val HIDE_QUEST_LIST_HEADERS_VARBIT_ID = 13889
      val SHOW_NUMBER_OF_OPTIONS_IN_MOUSEOVER_TOOLTIPS_VARBIT_ID = 13133
      val DISABLE_QUEST_LIST_TEXT_SHADOWS_VARBIT_ID = 13781
      val HIDE_COMPLETED_QUESTS_VARBIT_ID = 13777
      val HIDE_QUESTS_IN_PROGRESS_VARBIT_ID = 13775
      val HIDE_UNSTARTED_QUESTS_VARBIT_ID = 13776
      val ACCEPT_TRADE_DELAY_VARBIT_ID = 13130
      val XP_TRACKER_VARBIT_ID = 13089
      val DESERT_HEAT_DAMAGE_VARBIT_ID = 13134
      val SHOW_CONFIRMATION_WHEN_PAYING_FOR_ITEMS_FROM_GRAVESTONE_VARBIT_ID = 13113
      val WOODCUTTING_RESPAWN_TIMER_VARBIT_ID = 13086
      val ORE_RESPAWN_TIMER_VARBIT_ID = 13085
      val ANTI_DRAG_ENABLE_KEY_VARBIT_ID = 13828
      val CTRLCLICK_TO_INVERT_RUN_MODE_VARBIT_ID = 13132
      val ANTI_DRAG_DISABLE_KEY_VARBIT_ID = 13829
      val QUEST_LIST_TEXT_SIZE_VARBIT_ID = 13780
      val QUEST_LIST_SORTING_VARBIT_ID = 13772
      val SHOW_QUESTS_YOU_LACK_THE_REQUIREMENTS_FOR_VARBIT_ID = 13778
      val SHOW_QUESTS_YOU_LACK_THE_RECOMMENDED_STATS_FOR_VARBIT_ID = 13779
      val OPAQUE_IRON_GROUP_BROADCASTS_VARP_ID = 3193
      val TRANSPARENT_IRON_GROUP_BROADCASTS_VARP_ID = 3196
      val TRANSPARENT_IRON_GROUP_CHAT_VARP_ID = 3194
      val TRANSPARENT_CLAN_BROADCASTS_VARP_ID = 3195
      val OPAQUE_CLAN_BROADCASTS_VARP_ID = 3192
      val OPAQUE_IRON_GROUP_CHAT_VARP_ID = 3191
      val COMPLETED_QUEST_TEXT_COLOUR_VARP_ID = 3411
      val UNAVAILABLE_QUEST_TEXT_COLOUR_VARP_ID = 3412
      val UNSTARTED_QUEST_TEXT_COLOUR_VARP_ID = 3410
      val IN_PROGRESS_QUEST_TEXT_COLOUR_VARP_ID = 3409
      val HIDE_ROOFS_VARBIT_ID = 12378
      val MUSIC_UNLOCK_MESSAGE_VARBIT_ID = 10078
      val HITSPLAT_TINTING_VARBIT_ID = 10236
      val SHOW_WIKI_ENTITY_LOOKUP_VARBIT_ID = 10113
      val SHOW_DATA_ORBS_VARBIT_ID = 4084
      val TRANSPARENT_SIDE_PANEL_VARBIT_ID = 4609
      val SHOW_THE_REMAINING_XP_FOR_A_LEVEL_IN_THE_STATS_PANEL_VARBIT_ID = 4181
      val SHOW_PRAYER_TOOLTIPS_VARBIT_ID = 5711
      val SHOW_SPECIAL_ATTACK_TOOLTIP_VARBIT_ID = 5712
      val SHOW_BOSS_HEALTH_OVERLAY_VARBIT_ID = 12389
      val SHOW_NORMAL_HEALTH_OVERLAY_VARBIT_ID = 12390
      val TRANSPARENT_CHATBOX_VARBIT_ID = 4608
      val SCROLL_WHEEL_CAN_CHANGE_ZOOM_DISTANCE_VARBIT_ID = 6357
      val HIDE_PRIVATE_CHAT_WHEN_THE_CHATBOX_IS_HIDDEN_VARBIT_ID = 4089
      val LOOT_DROP_NOTIFICATIONS_VARBIT_ID = 5399
      val UNTRADEABLE_LOOT_NOTIFICATIONS_VARBIT_ID = 5402
      val FILTER_OUT_BOSS_KILLCOUNT_WITH_SPAMFILTER_VARBIT_ID = 4930
      val DROP_ITEM_WARNING_VARBIT_ID = 5411
      val CLICK_THROUGH_TRANSPARENT_CHATBOX_VARBIT_ID = 2570
      val SHOW_THE_STORE_BUTTON_ON_MOBILE_VARBIT_ID = 13036
      val SHOW_THE_STORE_BUTTON_ON_DESKTOP_VARBIT_ID = 13037
      val MIDDLE_MOUSE_BUTTON_CONTROLS_THE_CAMERA_VARBIT_ID = 4134
      val MOVE_FOLLOWER_OPTIONS_LOWER_DOWN_VARBIT_ID = 5599
      val SHIFT_CLICK_TO_DROP_ITEMS_VARBIT_ID = 5542
      val SHOW_THE_FUNCTION_BUTTON_VARBIT_ID = 6257
      val MODERN_LAYOUT_SIDE_PANEL_CAN_BE_CLOSED_BY_THE_HOTKEYS_VARBIT_ID = 4611
      val ESC_CLOSES_THE_CURRENT_INTERFACE_VARBIT_ID = 4681
      val ACCEPT_AID_VARBIT_ID = 4180
      val SHOW_WARNING_WHEN_CASTING_TELEPORT_TO_TARGET_VARBIT_ID = 236
      val SHOW_WARNING_WHEN_CASTING_DAREEYAK_TELEPORT_VARBIT_ID = 6284
      val SHOW_WARNING_WHEN_CASTING_CARRALLANGAR_TELEPORT_VARBIT_ID = 6285
      val SHOW_WARNING_WHEN_CASTING_ANNAKARL_TELEPORT_VARBIT_ID = 6286
      val SHOW_WARNING_WHEN_CASTING_GHORROCK_TELEPORT_VARBIT_ID = 6287
      val CASTING_ALCHEMY_SPELLS_ON_UNTRADEABLE_ITEMS_ALWAYS_TRIGGERS_A_WARNING_VARBIT_ID = 6092
      val SHOW_WARNING_WHEN_USING_TABLET_ICE_PLATEAU_VARBIT_ID = 2323
      val SHOW_WARNING_WHEN_USING_TABLET_CEMETERY_VARBIT_ID = 2322
      val SHOW_WARNING_WHEN_USING_TABLET_WILDERNESS_CRABS_VARBIT_ID = 3932
      val SHOW_WARNING_WHEN_USING_TABLET_DAREEYAK_VARBIT_ID = 3930
      val SHOW_WARNING_WHEN_USING_TABLET_CARRALLANGAR_VARBIT_ID = 2325
      val SHOW_WARNING_WHEN_USING_TABLET_ANNAKARL_VARBIT_ID = 2324
      val SHOW_WARNING_WHEN_USING_TABLET_GHORROCK_VARBIT_ID = 3931
      val ENABLE_PRECISE_TIMING_VARBIT_ID = 11866
      val ENABLE_SEPARATING_HOURS_VARBIT_ID = 11890
      val FOODPOTIONS_CAN_FORM_SUPPLY_PILES_ON_DEATH_VARBIT_ID = 11893
      val TILE_HIGHLIGHTING_VARBIT_ID = 12342
      val SHOW_MOUSEOVER_TOOLTIPS_VARBIT_ID = 12344
      val SHOW_MOUSEOVER_TEXT_VARBIT_ID = 12377
      val LIMIT_FRAMERATE_VARBIT_ID = 12345
      val DATA_ORBS_REGENERATION_INDICATORS_VARBIT_ID = 12346
      val CHAMBERS_OF_XERIC_HELPER_VARBIT_ID = 12347
      val AGILITY_HELPER_VARBIT_ID = 12379
      val HIGHLIGHT_AGILITY_OBSTACLES_VARBIT_ID = 12380
      val HIGHLIGHT_AGILITY_SHORTCUTS_VARBIT_ID = 12976
      val FISHING_SPOT_INDICATORS_VARBIT_ID = 12349
      val FISHING_SPOT_INDICATORS_TOOLS_ONLY_VARBIT_ID = 12350
      val FISHING_SPOT_INDICATORS_MOUSE_OVER_TOOLTIP_VARBIT_ID = 12351
      val SHOW_ATTACK_STYLE_VARBIT_ID = 12352
      val HOME_TELEPORT_COOLDOWN_VARBIT_ID = 12353
      val MINIGAME_TELEPORT_COOLDOWN_VARBIT_ID = 12354
      val DISPLAY_BUFF_BAR_VARBIT_ID = 9528
      val DISPLAY_FRAGMENTS_VARBIT_ID = 12383
      val TOOLTIPS_FOR_BUFFS_VARBIT_ID = 9529
      val TELEPORT_BLOCK_DURATION_VARBIT_ID = 12355
      val CHARGE_BUFF_DURATION_VARBIT_ID = 12356
      val GODWARS_ALTAR_COOLDOWN_VARBIT_ID = 12357
      val DRAGONFIRE_SHIELD_COOLDOWN_VARBIT_ID = 12358
      val IMBUED_HEART_COOLDOWN_VARBIT_ID = 12359
      val VENGEANCE_COOLDOWN_VARBIT_ID = 12360
      val VENGEANCE_ACTIVE_VARBIT_ID = 12361
      val STAMINA_DURATION_VARBIT_ID = 12362
      val PRAYER_ENHANCE_DURATION_VARBIT_ID = 12363
      val OVERLOAD_DURATION_VARBIT_ID = 12364
      val MAGIC_IMBUE_DURATION_VARBIT_ID = 12365
      val ABYSSAL_SIRE_STUN_DURATION_VARBIT_ID = 12366
      val FREEZEENTANGLED_DURATION_VARBIT_ID = 12367
      val STAFF_OF_THE_DEAD_SPECIAL_DURATION_VARBIT_ID = 12368
      val DIVINE_POTION_DURATIONS_VARBIT_ID = 12369
      val ANTIFIRE_POTION_DURATIONS_VARBIT_ID = 12370
      val ANTIVENOM_AND_POISON_POTION_DURATIONS_VARBIT_ID = 12371
      val ALWAYS_ON_TOP_VARBIT_ID = 12372
      val DISPLAY_MODIFIED_STATS_OVERLAY_VARBIT_ID = 12373
      val SHOW_TOOLTIPS_FOR_MODIFIED_STAT_OVERLAYS_VARBIT_ID = 12374
      val DISPLAY_RELATIVE_STAT_VALUE_VARBIT_ID = 12376
      val CORRUPTION_ACTIVE_AND_DURATION_VARBIT_ID = 12405
      val MARK_OF_DARKNESS_ACTIVE_VARBIT_ID = 12406
      val SHADOW_VEIL_ACTIVE_AND_DURATION_VARBIT_ID = 12407
      val DEATH_CHARGE_ACTIVE_AND_DURATION_VARBIT_ID = 12408
      val WARD_OF_ARCEUUS_ACTIVE_AND_DURATION_VARBIT_ID = 12409
      val RESURRECTION_ACTIVE_AND_DURATION_VARBIT_ID = 12410
      val COMBAT_ACHIEVEMENT_TASKS_FAILURE_VARBIT_ID = 12454
      val COMBAT_ACHIEVEMENT_TASKS_COMPLETION_POPUP_VARBIT_ID = 12455
      val COMBAT_ACHIEVEMENT_TASKS_REPEAT_COMPLETION_VARBIT_ID = 12456
      val COMBAT_ACHIEVEMENT_TASKS_REPEAT_FAILURE_VARBIT_ID = 12457
      val REMAINING_AMMO_VARBIT_ID = 12985
      val HIGHLIGHT_HOVERED_TILE_VARBIT_ID = 12977
      val HIGHLIGHT_CURRENT_TILE_VARBIT_ID = 12978
      val HIGHLIGHT_DESTINATION_TILE_VARBIT_ID = 12979
      val HIGHLIGHT_HOVERED_TILE_ALWAYS_ON_TOP_VARBIT_ID = 12980
      val HIGHLIGHT_CURRENT_TILE_ALWAYS_ON_TOP_VARBIT_ID = 12981
      val HIGHLIGHT_DESTINATION_TILE_ALWAYS_ON_TOP_VARBIT_ID = 12982
      val ENABLE_MINIMAP_ZOOM_VARBIT_ID = 12983
      val SHOW_CHAT_EFFECTS_VARP_ID = 171
      val SPLIT_FRIENDS_PRIVATE_CHAT_VARP_ID = 287
      val ENABLE_PROFANITY_FILTER_VARP_ID = 1074
      val SINGLE_MOUSE_BUTTON_MODE_VARP_ID = 170
      val INTERFACE_SCALING_VARBIT_ID = 11864
      val MUSIC_VOLUME_VARP_ID = 168
      val SOUND_EFFECT_VOLUME_VARP_ID = 169
      val AREA_SOUND_VOLUME_VARP_ID = 872
      val SCREEN_BRIGHTNESS_VARP_ID = 166
      val LAST_MAN_STANDING_FOG_COLOUR_VARBIT_ID = 11865
      val MUSIC_AREA_MODE_VARBIT_ID = 12233
      val FRIEND_LOGINLOGOUT_MESSAGES_VARBIT_ID = 12274
      val CHAT_TIMESTAMPS_VARBIT_ID = 12384
      val SELECT_FUNCTIONMODE_VARBIT_ID = 6255
      val CHAT_BOX_SCROLLBAR_POSITION_VARBIT_ID = 6374
      val MODERN_LAYOUT_SIDE_PANEL_VISUAL_APPEARANCE_VARBIT_ID = 12135
      val NUMBER_OF_MODIFIED_STATS_TO_SHOW_VARBIT_ID = 12375
      val PLAYER_ATTACK_OPTIONS_VARP_ID = 1107
      val NPC_ATTACK_OPTIONS_VARP_ID = 1306
      val COMBAT_TAB_KEYBIND_VARBIT_ID = 4675
      val PRAYER_TAB_KEYBIND_VARBIT_ID = 4680
      val SETTINGS_TAB_KEYBIND_VARBIT_ID = 4686
      val SKILLS_TAB_KEYBIND_VARBIT_ID = 4676
      val MAGIC_TAB_KEYBIND_VARBIT_ID = 4682
      val EMOTES_TAB_KEYBIND_VARBIT_ID = 4687
      val JOURNAL_TAB_KEYBIND_VARBIT_ID = 4677
      val FRIENDS_LIST_KEYBIND_VARBIT_ID = 4684
      val FRIENDS_CHAT_TAB_KEYBIND_VARBIT_ID = 4683
      val INVENTORY_TAB_KEYBIND_VARBIT_ID = 4678
      val ACCOUNT_MANAGEMENT_TAB_KEYBIND_VARBIT_ID = 6517
      val MUSIC_TAB_KEYBIND_VARBIT_ID = 4688
      val EQUIPMENT_TAB_KEYBIND_VARBIT_ID = 4679
      val LOGOUT_TAB_KEYBIND_VARBIT_ID = 4689
      val OPAQUE_PUBLIC_CHAT_VARP_ID = 2992
      val TRANSPARENT_PUBLIC_CHAT_VARP_ID = 3000
      val OPAQUE_PRIVATE_CHAT_VARP_ID = 2993
      val TRANSPARENT_PRIVATE_CHAT_VARP_ID = 3001
      val SPLIT_PRIVATE_CHAT_VARP_ID = 3008
      val OPAQUE_AUTO_CHAT_VARP_ID = 2994
      val TRANSPARENT_AUTO_CHAT_VARP_ID = 3002
      val OPAQUE_BROADCAST_VARP_ID = 2995
      val TRANSPARENT_BROADCAST_VARP_ID = 3003
      val SPLIT_BROADCAST_VARP_ID = 3009
      val OPAQUE_FRIEND_CHAT_VARP_ID = 2996
      val TRANSPARENT_FRIEND_CHAT_VARP_ID = 3004
      val OPAQUE_CLAN_CHAT_VARP_ID = 2997
      val TRANSPARENT_CLAN_CHAT_VARP_ID = 3005
      val OPAQUE_INCOMING_TRADE_REQUEST_VARP_ID = 2998
      val TRANSPARENT_INCOMING_TRADE_REQUEST_VARP_ID = 3006
      val OPAQUE_INCOMING_CHALLENGE_REQUEST_VARP_ID = 2999
      val TRANSPARENT_INCOMING_CHALLENGE_REQUEST_VARP_ID = 3007
      val OPAQUE_GUEST_CLAN_CHAT_VARP_ID = 3060
      val TRANSPARENT_GUEST_CLAN_CHAT_VARP_ID = 3061
      val TILE_HIGHLIGHT_COLOUR_VARP_ID = 3108
      val HIGHLIGHT_HOVERED_TILE_COLOUR_VARP_ID = 3155
      val HIGHLIGHT_CURRENT_TILE_COLOUR_VARP_ID = 3156
      val HIGHLIGHT_DESTINATION_TILE_COLOUR_VARP_ID = 3157

      val TOGGLE_SETTING_VARBITS = mapOf(
            SettingStructs.HIDE_ROOFS_STRUCT_ID to HIDE_ROOFS_VARBIT_ID,
            SettingStructs.MUSIC_UNLOCK_MESSAGE_STRUCT_ID to MUSIC_UNLOCK_MESSAGE_VARBIT_ID,
            SettingStructs.HITSPLAT_TINTING_STRUCT_ID to HITSPLAT_TINTING_VARBIT_ID,
            SettingStructs.SHOW_WIKI_ENTITY_LOOKUP_STRUCT_ID to SHOW_WIKI_ENTITY_LOOKUP_VARBIT_ID,
            SettingStructs.SHOW_DATA_ORBS_STRUCT_ID to SHOW_DATA_ORBS_VARBIT_ID,
            SettingStructs.TRANSPARENT_SIDE_PANEL_STRUCT_ID to TRANSPARENT_SIDE_PANEL_VARBIT_ID,
            SettingStructs.SHOW_THE_REMAINING_XP_FOR_A_LEVEL_IN_THE_STATS_PANEL_STRUCT_ID to SHOW_THE_REMAINING_XP_FOR_A_LEVEL_IN_THE_STATS_PANEL_VARBIT_ID,
            SettingStructs.SHOW_PRAYER_TOOLTIPS_STRUCT_ID to SHOW_PRAYER_TOOLTIPS_VARBIT_ID,
            SettingStructs.SHOW_SPECIAL_ATTACK_TOOLTIP_STRUCT_ID to SHOW_SPECIAL_ATTACK_TOOLTIP_VARBIT_ID,
            SettingStructs.SHOW_BOSS_HEALTH_OVERLAY_STRUCT_ID to SHOW_BOSS_HEALTH_OVERLAY_VARBIT_ID,
            SettingStructs.SHOW_NORMAL_HEALTH_OVERLAY_STRUCT_ID to SHOW_NORMAL_HEALTH_OVERLAY_VARBIT_ID,
            SettingStructs.TRANSPARENT_CHATBOX_STRUCT_ID to TRANSPARENT_CHATBOX_VARBIT_ID,
            SettingStructs.SCROLL_WHEEL_CAN_CHANGE_ZOOM_DISTANCE_STRUCT_ID to SCROLL_WHEEL_CAN_CHANGE_ZOOM_DISTANCE_VARBIT_ID,
            SettingStructs.HIDE_PRIVATE_CHAT_WHEN_THE_CHATBOX_IS_HIDDEN_STRUCT_ID to HIDE_PRIVATE_CHAT_WHEN_THE_CHATBOX_IS_HIDDEN_VARBIT_ID,
            SettingStructs.LOOT_DROP_NOTIFICATIONS_STRUCT_ID to LOOT_DROP_NOTIFICATIONS_VARBIT_ID,
            SettingStructs.UNTRADEABLE_LOOT_NOTIFICATIONS_STRUCT_ID to UNTRADEABLE_LOOT_NOTIFICATIONS_VARBIT_ID,
            SettingStructs.FILTER_OUT_BOSS_KILLCOUNT_WITH_SPAMFILTER_STRUCT_ID to FILTER_OUT_BOSS_KILLCOUNT_WITH_SPAMFILTER_VARBIT_ID,
            SettingStructs.DROP_ITEM_WARNING_STRUCT_ID to DROP_ITEM_WARNING_VARBIT_ID,
            SettingStructs.CLICK_THROUGH_TRANSPARENT_CHATBOX_STRUCT_ID to CLICK_THROUGH_TRANSPARENT_CHATBOX_VARBIT_ID,
            SettingStructs.SHOW_THE_STORE_BUTTON_ON_DESKTOP_STRUCT_ID to SHOW_THE_STORE_BUTTON_ON_DESKTOP_VARBIT_ID,
            SettingStructs.SHOW_THE_STORE_BUTTON_ON_MOBILE_STRUCT_ID to SHOW_THE_STORE_BUTTON_ON_MOBILE_VARBIT_ID,
            SettingStructs.MIDDLE_MOUSE_BUTTON_CONTROLS_THE_CAMERA_STRUCT_ID to MIDDLE_MOUSE_BUTTON_CONTROLS_THE_CAMERA_VARBIT_ID,
            SettingStructs.MOVE_FOLLOWER_OPTIONS_LOWER_DOWN_STRUCT_ID to MOVE_FOLLOWER_OPTIONS_LOWER_DOWN_VARBIT_ID,
            SettingStructs.SHIFT_CLICK_TO_DROP_ITEMS_STRUCT_ID to SHIFT_CLICK_TO_DROP_ITEMS_VARBIT_ID,
            SettingStructs.SHOW_THE_FUNCTION_BUTTON_STRUCT_ID to SHOW_THE_FUNCTION_BUTTON_VARBIT_ID,
            SettingStructs.MODERN_LAYOUT_SIDE_PANEL_CAN_BE_CLOSED_BY_THE_HOTKEYS_STRUCT_ID to MODERN_LAYOUT_SIDE_PANEL_CAN_BE_CLOSED_BY_THE_HOTKEYS_VARBIT_ID,
            SettingStructs.ESC_CLOSES_THE_CURRENT_INTERFACE_STRUCT_ID to ESC_CLOSES_THE_CURRENT_INTERFACE_VARBIT_ID,
            SettingStructs.ACCEPT_AID_STRUCT_ID to ACCEPT_AID_VARBIT_ID,
            SettingStructs.SHOW_WARNING_WHEN_CASTING_TELEPORT_TO_TARGET_STRUCT_ID to SHOW_WARNING_WHEN_CASTING_TELEPORT_TO_TARGET_VARBIT_ID,
            SettingStructs.SHOW_WARNING_WHEN_CASTING_DAREEYAK_TELEPORT_STRUCT_ID to SHOW_WARNING_WHEN_CASTING_DAREEYAK_TELEPORT_VARBIT_ID,
            SettingStructs.SHOW_WARNING_WHEN_CASTING_ANNAKARL_TELEPORT_STRUCT_ID to SHOW_WARNING_WHEN_CASTING_ANNAKARL_TELEPORT_VARBIT_ID,
            SettingStructs.SHOW_WARNING_WHEN_CASTING_CARRALLANGAR_TELEPORT_STRUCT_ID to SHOW_WARNING_WHEN_CASTING_CARRALLANGAR_TELEPORT_VARBIT_ID,
            SettingStructs.SHOW_WARNING_WHEN_CASTING_GHORROCK_TELEPORT_STRUCT_ID to SHOW_WARNING_WHEN_CASTING_GHORROCK_TELEPORT_VARBIT_ID,
            SettingStructs.CASTING_ALCHEMY_SPELLS_ON_UNTRADEABLE_ITEMS_ALWAYS_TRIGGERS_A_WARNING_STRUCT_ID to CASTING_ALCHEMY_SPELLS_ON_UNTRADEABLE_ITEMS_ALWAYS_TRIGGERS_A_WARNING_VARBIT_ID,
            SettingStructs.SHOW_WARNING_WHEN_USING_TABLET_ANNAKARL_STRUCT_ID to SHOW_WARNING_WHEN_USING_TABLET_ANNAKARL_VARBIT_ID,
            SettingStructs.SHOW_WARNING_WHEN_USING_TABLET_CARRALLANGAR_STRUCT_ID to SHOW_WARNING_WHEN_USING_TABLET_CARRALLANGAR_VARBIT_ID,
            SettingStructs.SHOW_WARNING_WHEN_USING_TABLET_CEMETERY_STRUCT_ID to SHOW_WARNING_WHEN_USING_TABLET_CEMETERY_VARBIT_ID,
            SettingStructs.SHOW_WARNING_WHEN_USING_TABLET_DAREEYAK_STRUCT_ID to SHOW_WARNING_WHEN_USING_TABLET_DAREEYAK_VARBIT_ID,
            SettingStructs.SHOW_WARNING_WHEN_USING_TABLET_GHORROCK_STRUCT_ID to SHOW_WARNING_WHEN_USING_TABLET_GHORROCK_VARBIT_ID,
            SettingStructs.SHOW_WARNING_WHEN_USING_TABLET_ICE_PLATEAU_STRUCT_ID to SHOW_WARNING_WHEN_USING_TABLET_ICE_PLATEAU_VARBIT_ID,
            SettingStructs.SHOW_WARNING_WHEN_USING_TABLET_WILDERNESS_CRABS_STRUCT_ID to SHOW_WARNING_WHEN_USING_TABLET_WILDERNESS_CRABS_VARBIT_ID,
            SettingStructs.ENABLE_PRECISE_TIMING_STRUCT_ID to ENABLE_PRECISE_TIMING_VARBIT_ID,
            SettingStructs.ENABLE_SEPARATING_HOURS_STRUCT_ID to ENABLE_SEPARATING_HOURS_VARBIT_ID,
            SettingStructs.FOOD_AND_POTIONS_CAN_FORM_SUPPLY_PILES_ON_DEATH_STRUCT_ID to FOODPOTIONS_CAN_FORM_SUPPLY_PILES_ON_DEATH_VARBIT_ID,
            SettingStructs.TILE_HIGHLIGHTING_STRUCT_ID to TILE_HIGHLIGHTING_VARBIT_ID,
            SettingStructs.SHOW_MOUSEOVER_TOOLTIPS_STRUCT_ID to SHOW_MOUSEOVER_TOOLTIPS_VARBIT_ID,
            SettingStructs.SHOW_MOUSEOVER_TEXT_STRUCT_ID to SHOW_MOUSEOVER_TEXT_VARBIT_ID,
            SettingStructs.DATA_ORBS_REGENERATION_INDICATORS_STRUCT_ID to DATA_ORBS_REGENERATION_INDICATORS_VARBIT_ID,
            SettingStructs.CHAMBERS_OF_XERIC_HELPER_STRUCT_ID to CHAMBERS_OF_XERIC_HELPER_VARBIT_ID,
            SettingStructs.AGILITY_HELPER_STRUCT_ID to AGILITY_HELPER_VARBIT_ID,
            SettingStructs.HIGHLIGHT_AGILITY_OBSTACLES_STRUCT_ID to HIGHLIGHT_AGILITY_OBSTACLES_VARBIT_ID,
            SettingStructs.HIGHLIGHT_AGILITY_SHORTCUTS_STRUCT_ID to HIGHLIGHT_AGILITY_SHORTCUTS_VARBIT_ID,
            SettingStructs.FISHING_SPOT_INDICATORS_STRUCT_ID to FISHING_SPOT_INDICATORS_VARBIT_ID,
            SettingStructs.FISHING_SPOT_INDICATORS_TOOLS_ONLY_STRUCT_ID to FISHING_SPOT_INDICATORS_TOOLS_ONLY_VARBIT_ID,
            SettingStructs.FISHING_SPOT_INDICATORS_MOUSE_OVER_TOOLTIP_STRUCT_ID to FISHING_SPOT_INDICATORS_MOUSE_OVER_TOOLTIP_VARBIT_ID,
            SettingStructs.SHOW_ATTACK_STYLE_STRUCT_ID to SHOW_ATTACK_STYLE_VARBIT_ID,
            SettingStructs.HOME_TELEPORT_COOLDOWN_STRUCT_ID to HOME_TELEPORT_COOLDOWN_VARBIT_ID,
            SettingStructs.MINIGAME_TELEPORT_COOLDOWN_STRUCT_ID to MINIGAME_TELEPORT_COOLDOWN_VARBIT_ID,
            SettingStructs.DISPLAY_BUFF_BAR_STRUCT_ID to DISPLAY_BUFF_BAR_VARBIT_ID,
            SettingStructs.DISPLAY_FRAGMENTS_STRUCT_ID to DISPLAY_FRAGMENTS_VARBIT_ID,
            SettingStructs.TOOLTIPS_FOR_BUFFS_STRUCT_ID to TOOLTIPS_FOR_BUFFS_VARBIT_ID,
            SettingStructs.TELEPORT_BLOCK_DURATION_STRUCT_ID to TELEPORT_BLOCK_DURATION_VARBIT_ID,
            SettingStructs.CHARGE_BUFF_DURATION_STRUCT_ID to CHARGE_BUFF_DURATION_VARBIT_ID,
            SettingStructs.GODWARS_ALTAR_COOLDOWN_STRUCT_ID to GODWARS_ALTAR_COOLDOWN_VARBIT_ID,
            SettingStructs.DRAGONFIRE_SHIELD_COOLDOWN_STRUCT_ID to DRAGONFIRE_SHIELD_COOLDOWN_VARBIT_ID,
            SettingStructs.IMBUED_HEART_COOLDOWN_STRUCT_ID to IMBUED_HEART_COOLDOWN_VARBIT_ID,
            SettingStructs.VENGEANCE_COOLDOWN_STRUCT_ID to VENGEANCE_COOLDOWN_VARBIT_ID,
            SettingStructs.VENGEANCE_ACTIVE_STRUCT_ID to VENGEANCE_ACTIVE_VARBIT_ID,
            SettingStructs.STAMINA_DURATION_STRUCT_ID to STAMINA_DURATION_VARBIT_ID,
            SettingStructs.PRAYER_ENHANCE_DURATION_STRUCT_ID to PRAYER_ENHANCE_DURATION_VARBIT_ID,
            SettingStructs.OVERLOAD_DURATION_STRUCT_ID to OVERLOAD_DURATION_VARBIT_ID,
            SettingStructs.MAGIC_IMBUE_DURATION_STRUCT_ID to MAGIC_IMBUE_DURATION_VARBIT_ID,
            SettingStructs.ABYSSAL_SIRE_STUN_DURATION_STRUCT_ID to ABYSSAL_SIRE_STUN_DURATION_VARBIT_ID,
            SettingStructs.FREEZEENTANGLED_DURATION_STRUCT_ID to FREEZEENTANGLED_DURATION_VARBIT_ID,
            SettingStructs.STAFF_OF_THE_DEAD_SPECIAL_DURATION_STRUCT_ID to STAFF_OF_THE_DEAD_SPECIAL_DURATION_VARBIT_ID,
            SettingStructs.DIVINE_POTION_DURATIONS_STRUCT_ID to DIVINE_POTION_DURATIONS_VARBIT_ID,
            SettingStructs.ANTIFIRE_POTION_DURATIONS_STRUCT_ID to ANTIFIRE_POTION_DURATIONS_VARBIT_ID,
            SettingStructs.ANTIVENOM_AND_POISON_POTION_DURATIONS_STRUCT_ID to ANTIVENOM_AND_POISON_POTION_DURATIONS_VARBIT_ID,
            SettingStructs.ALWAYS_ON_TOP_STRUCT_ID to ALWAYS_ON_TOP_VARBIT_ID,
            SettingStructs.DISPLAY_MODIFIED_STATS_OVERLAY_STRUCT_ID to DISPLAY_MODIFIED_STATS_OVERLAY_VARBIT_ID,
            SettingStructs.SHOW_TOOLTIPS_FOR_MODIFIED_STAT_OVERLAYS_STRUCT_ID to SHOW_TOOLTIPS_FOR_MODIFIED_STAT_OVERLAYS_VARBIT_ID,
            SettingStructs.DISPLAY_RELATIVE_STAT_VALUE_STRUCT_ID to DISPLAY_RELATIVE_STAT_VALUE_VARBIT_ID,
            SettingStructs.CORRUPTION_ACTIVE_AND_DURATION_STRUCT_ID to CORRUPTION_ACTIVE_AND_DURATION_VARBIT_ID,
            SettingStructs.MARK_OF_DARKNESS_ACTIVE_STRUCT_ID to MARK_OF_DARKNESS_ACTIVE_VARBIT_ID,
            SettingStructs.SHADOW_VEIL_ACTIVE_AND_DURATION_STRUCT_ID to SHADOW_VEIL_ACTIVE_AND_DURATION_VARBIT_ID,
            SettingStructs.DEATH_CHARGE_ACTIVE_AND_DURATION_STRUCT_ID to DEATH_CHARGE_ACTIVE_AND_DURATION_VARBIT_ID,
            SettingStructs.WARD_OF_ARCEUUS_ACTIVE_AND_DURATION_STRUCT_ID to WARD_OF_ARCEUUS_ACTIVE_AND_DURATION_VARBIT_ID,
            SettingStructs.RESURRECTION_ACTIVE_AND_DURATION_STRUCT_ID to RESURRECTION_ACTIVE_AND_DURATION_VARBIT_ID,
            SettingStructs.COMBAT_ACHIEVEMENT_TASKS_FAILURE_STRUCT_ID to COMBAT_ACHIEVEMENT_TASKS_FAILURE_VARBIT_ID,
            SettingStructs.COMBAT_ACHIEVEMENT_TASKS_COMPLETION_POPUP_STRUCT_ID to COMBAT_ACHIEVEMENT_TASKS_COMPLETION_POPUP_VARBIT_ID,
            SettingStructs.COMBAT_ACHIEVEMENT_TASKS_REPEAT_COMPLETION_STRUCT_ID to COMBAT_ACHIEVEMENT_TASKS_REPEAT_COMPLETION_VARBIT_ID,
            SettingStructs.COMBAT_ACHIEVEMENT_TASKS_REPEAT_FAILURE_STRUCT_ID to COMBAT_ACHIEVEMENT_TASKS_REPEAT_FAILURE_VARBIT_ID,
            SettingStructs.REMAINING_AMMO_STRUCT_ID to REMAINING_AMMO_VARBIT_ID,
            SettingStructs.HIGHLIGHT_HOVERED_TILE_STRUCT_ID to HIGHLIGHT_HOVERED_TILE_VARBIT_ID,
            SettingStructs.HIGHLIGHT_CURRENT_TILE_STRUCT_ID to HIGHLIGHT_CURRENT_TILE_VARBIT_ID,
            SettingStructs.HIGHLIGHT_DESTINATION_TILE_STRUCT_ID to HIGHLIGHT_DESTINATION_TILE_VARBIT_ID,
            SettingStructs.HIGHLIGHT_HOVERED_TILE_ALWAYS_ON_TOP_STRUCT_ID to HIGHLIGHT_HOVERED_TILE_ALWAYS_ON_TOP_VARBIT_ID,
            SettingStructs.HIGHLIGHT_CURRENT_TILE_ALWAYS_ON_TOP_STRUCT_ID to HIGHLIGHT_CURRENT_TILE_ALWAYS_ON_TOP_VARBIT_ID,
            SettingStructs.HIGHLIGHT_DESTINATION_TILE_ALWAYS_ON_TOP_STRUCT_ID to HIGHLIGHT_DESTINATION_TILE_ALWAYS_ON_TOP_VARBIT_ID,
            SettingStructs.ENABLE_MINIMAP_ZOOM_STRUCT_ID to ENABLE_MINIMAP_ZOOM_VARBIT_ID,
            SettingStructs.HIGHLIGHT_ENTITIES_ON_MOUSEOVER_STRUCT_ID to HIGHLIGHT_ENTITIES_ON_MOUSEOVER_VARBIT_ID,
            SettingStructs.HIGHLIGHT_AGILITY_SHORTCUTS_SHORTCUT_REQUIREMENTS_STRUCT_ID to HIGHLIGHT_AGILITY_SHORTCUTS_SHORTCUT_REQUIREMENTS_VARBIT_ID,
            SettingStructs.BIRD_NEST_NOTIFICATION_STRUCT_ID to BIRD_NEST_NOTIFICATION_VARBIT_ID,
            SettingStructs.SLAYER_HELPER_STRUCT_ID to SLAYER_HELPER_VARBIT_ID,
            SettingStructs.IRON_LOOT_RESTRICTION_INDICATOR_STRUCT_ID to IRON_LOOT_RESTRICTION_INDICATOR_VARBIT_ID,
            SettingStructs.IRON_LOOT_RESTRICTION_MESSAGES_STRUCT_ID to IRON_LOOT_RESTRICTION_MESSAGES_VARBIT_ID,
            SettingStructs.HIGHLIGHT_ENTITIES_ON_TAP_STRUCT_ID to HIGHLIGHT_ENTITIES_ON_TAP_VARBIT_ID,
            SettingStructs.VIBRATE_ON_INTERACTION_STRUCT_ID to VIBRATE_ON_INTERACTION_VARBIT_ID,
            SettingStructs.VIBRATE_WHEN_MINIMENU_OPENS_STRUCT_ID to VIBRATE_WHEN_MINIMENU_OPENS_VARBIT_ID,
            SettingStructs.VIBRATE_ON_DRAG_STRUCT_ID to VIBRATE_ON_DRAG_VARBIT_ID,
            SettingStructs.VIBRATE_WHEN_HOVERING_OVER_MINIMENU_ENTRIES_STRUCT_ID to VIBRATE_WHEN_HOVERING_OVER_MINIMENU_ENTRIES_VARBIT_ID,
            SettingStructs.PK_SKULL_PREVENTION_STRUCT_ID to PK_SKULL_PREVENTION_VARBIT_ID,
            SettingStructs.ANTI_DRAG_STRUCT_ID to ANTI_DRAG_VARBIT_ID,
            SettingStructs.EXAMINE_PRICE_INFO_GRAND_EXCHANGE_STRUCT_ID to EXAMINE_PRICE_INFO_GRAND_EXCHANGE_VARBIT_ID,
            SettingStructs.CHATBOX_MODE_SET_AUTOMATICALLY_STRUCT_ID to CHATBOX_MODE_SET_AUTOMATICALLY_VARBIT_ID,
            SettingStructs.EXAMINE_PRICE_INFO_ALCHEMY_STRUCT_ID to EXAMINE_PRICE_INFO_ALCHEMY_VARBIT_ID,
            SettingStructs.LOGOUT_NOTIFIER_STRUCT_ID to LOGOUT_NOTIFIER_VARBIT_ID,
            SettingStructs.HIDE_UNAVAILABLE_QUESTS_STRUCT_ID to HIDE_UNAVAILABLE_QUESTS_VARBIT_ID,
            SettingStructs.POISON_DAMAGE_STRUCT_ID to POISON_DAMAGE_VARBIT_ID,
            SettingStructs.HIDE_QUESTS_STRUCT_ID to HIDE_QUESTS_VARBIT_ID,
            SettingStructs.HIDE_MINIQUESTS_STRUCT_ID to HIDE_MINIQUESTS_VARBIT_ID,
            SettingStructs.HIDE_QUEST_LIST_HEADERS_STRUCT_ID to HIDE_QUEST_LIST_HEADERS_VARBIT_ID,
            SettingStructs.SHOW_NUMBER_OF_OPTIONS_IN_MOUSEOVER_TOOLTIPS_STRUCT_ID to SHOW_NUMBER_OF_OPTIONS_IN_MOUSEOVER_TOOLTIPS_VARBIT_ID,
            SettingStructs.DISABLE_QUEST_LIST_TEXT_SHADOWS_STRUCT_ID to DISABLE_QUEST_LIST_TEXT_SHADOWS_VARBIT_ID,
            SettingStructs.HIDE_COMPLETED_QUESTS_STRUCT_ID to HIDE_COMPLETED_QUESTS_VARBIT_ID,
            SettingStructs.HIDE_QUESTS_IN_PROGRESS_STRUCT_ID to HIDE_QUESTS_IN_PROGRESS_VARBIT_ID,
            SettingStructs.HIDE_UNSTARTED_QUESTS_STRUCT_ID to HIDE_UNSTARTED_QUESTS_VARBIT_ID,
            SettingStructs.ACCEPT_TRADE_DELAY_STRUCT_ID to ACCEPT_TRADE_DELAY_VARBIT_ID,
            SettingStructs.XP_TRACKER_STRUCT_ID to XP_TRACKER_VARBIT_ID,
            SettingStructs.DESERT_HEAT_DAMAGE_STRUCT_ID to DESERT_HEAT_DAMAGE_VARBIT_ID,
            SettingStructs.SHOW_CONFIRMATION_WHEN_PAYING_FOR_ITEMS_FROM_GRAVESTONE_STRUCT_ID to SHOW_CONFIRMATION_WHEN_PAYING_FOR_ITEMS_FROM_GRAVESTONE_VARBIT_ID,
            SettingStructs.CHAT_COLOUR_TRANSPARENT_STRUCT_ID to TRANSPARENT_CHATBOX_VARBIT_ID
      )

      val TOGGLE_SETTINGS_VARPS = mapOf(
            SettingStructs.SHOW_CHAT_EFFECTS_STRUCT_ID to SHOW_CHAT_EFFECTS_VARP_ID,
            SettingStructs.SPLIT_FRIENDS_PRIVATE_CHAT_STRUCT_ID to SPLIT_FRIENDS_PRIVATE_CHAT_VARP_ID,
            SettingStructs.ENABLE_PROFANITY_FILTER_STRUCT_ID to ENABLE_PROFANITY_FILTER_VARP_ID,
            SettingStructs.SINGLE_MOUSE_BUTTON_MODE_STRUCT_ID to SINGLE_MOUSE_BUTTON_MODE_VARP_ID
      )

      val SLIDER_SETTING_VARBITS = mapOf(
            SettingStructs.INTERFACE_SCALING_STRUCT_ID to INTERFACE_SCALING_VARBIT_ID
      )

      val SLIDER_SETTING_VARPS = mapOf(
            SettingStructs.MUSIC_VOLUME_STRUCT_ID to MUSIC_VOLUME_VARP_ID,
            SettingStructs.SOUND_EFFECT_VOLUME_STRUCT_ID to SOUND_EFFECT_VOLUME_VARP_ID,
            SettingStructs.AREA_SOUND_VOLUME_STRUCT_ID to AREA_SOUND_VOLUME_VARP_ID,
            SettingStructs.SCREEN_BRIGHTNESS_STRUCT_ID to SCREEN_BRIGHTNESS_VARP_ID
      )

      val DROPDOWN_SETTING_VARBITS = mapOf(
            SettingStructs.LAST_MAN_STANDING_FOG_COLOUR_STRUCT_ID to LAST_MAN_STANDING_FOG_COLOUR_VARBIT_ID,
            SettingStructs.MUSIC_AREA_MODE_STRUCT_ID to MUSIC_AREA_MODE_VARBIT_ID,
            SettingStructs.FRIEND_LOGINLOGOUT_MESSAGES_STRUCT_ID to FRIEND_LOGINLOGOUT_MESSAGES_VARBIT_ID,
            SettingStructs.CHAT_TIMESTAMPS_STRUCT_ID to CHAT_TIMESTAMPS_VARBIT_ID,
            SettingStructs.SELECT_FUNCTIONMODE_STRUCT_ID to SELECT_FUNCTIONMODE_VARBIT_ID,
            SettingStructs.CHAT_BOX_SCROLLBAR_POSITION_STRUCT_ID to CHAT_BOX_SCROLLBAR_POSITION_VARBIT_ID,
            SettingStructs.MODERN_LAYOUT_SIDE_PANEL_VISUAL_APPEARANCE_STRUCT_ID to MODERN_LAYOUT_SIDE_PANEL_VISUAL_APPEARANCE_VARBIT_ID,
            SettingStructs.NUMBER_OF_MODIFIED_STATS_TO_SHOW_STRUCT_ID to NUMBER_OF_MODIFIED_STATS_TO_SHOW_VARBIT_ID,
            SettingStructs.WOODCUTTING_RESPAWN_TIMER_STRUCT_ID to WOODCUTTING_RESPAWN_TIMER_VARBIT_ID,
            SettingStructs.ORE_RESPAWN_TIMER_STRUCT_ID to ORE_RESPAWN_TIMER_VARBIT_ID,
            SettingStructs.ANTI_DRAG_ENABLE_KEY_STRUCT_ID to ANTI_DRAG_ENABLE_KEY_VARBIT_ID,
            SettingStructs.CTRLCLICK_TO_INVERT_RUN_MODE_STRUCT_ID to CTRLCLICK_TO_INVERT_RUN_MODE_VARBIT_ID,
            SettingStructs.ANTI_DRAG_DISABLE_KEY_STRUCT_ID to ANTI_DRAG_DISABLE_KEY_VARBIT_ID,
            SettingStructs.QUEST_LIST_TEXT_SIZE_STRUCT_ID to QUEST_LIST_TEXT_SIZE_VARBIT_ID,
            SettingStructs.QUEST_LIST_SORTING_STRUCT_ID to QUEST_LIST_SORTING_VARBIT_ID,
            SettingStructs.SHOW_QUESTS_YOU_LACK_THE_REQUIREMENTS_FOR_STRUCT_ID to SHOW_QUESTS_YOU_LACK_THE_REQUIREMENTS_FOR_VARBIT_ID,
            SettingStructs.SHOW_QUESTS_YOU_LACK_THE_RECOMMENDED_STATS_FOR_STRUCT_ID to SHOW_QUESTS_YOU_LACK_THE_RECOMMENDED_STATS_FOR_VARBIT_ID
      )

      val DROPDOWN_SETTING_VARPS = mapOf(
            SettingStructs.PLAYER_ATTACK_OPTIONS_STRUCT_ID to PLAYER_ATTACK_OPTIONS_VARP_ID,
            SettingStructs.NPC_ATTACK_OPTIONS_STRUCT_ID to NPC_ATTACK_OPTIONS_VARP_ID
      )

      val KEYBIND_SETTING_VARBITS = mapOf(
            SettingStructs.COMBAT_TAB_KEYBIND_STRUCT_ID to COMBAT_TAB_KEYBIND_VARBIT_ID,
            SettingStructs.PRAYER_TAB_KEYBIND_STRUCT_ID to PRAYER_TAB_KEYBIND_VARBIT_ID,
            SettingStructs.SETTINGS_TAB_KEYBIND_STRUCT_ID to SETTINGS_TAB_KEYBIND_VARBIT_ID,
            SettingStructs.SKILLS_TAB_KEYBIND_STRUCT_ID to SKILLS_TAB_KEYBIND_VARBIT_ID,
            SettingStructs.MAGIC_TAB_KEYBIND_STRUCT_ID to MAGIC_TAB_KEYBIND_VARBIT_ID,
            SettingStructs.EMOTES_TAB_KEYBIND_STRUCT_ID to EMOTES_TAB_KEYBIND_VARBIT_ID,
            SettingStructs.JOURNAL_TAB_KEYBIND_STRUCT_ID to JOURNAL_TAB_KEYBIND_VARBIT_ID,
            SettingStructs.FRIENDS_LIST_KEYBIND_STRUCT_ID to FRIENDS_LIST_KEYBIND_VARBIT_ID,
            SettingStructs.FRIENDS_CHAT_TAB_KEYBIND_STRUCT_ID to FRIENDS_CHAT_TAB_KEYBIND_VARBIT_ID,
            SettingStructs.INVENTORY_TAB_KEYBIND_STRUCT_ID to INVENTORY_TAB_KEYBIND_VARBIT_ID,
            SettingStructs.ACCOUNT_MANAGEMENT_TAB_KEYBIND_STRUCT_ID to ACCOUNT_MANAGEMENT_TAB_KEYBIND_VARBIT_ID,
            SettingStructs.MUSIC_TAB_KEYBIND_STRUCT_ID to MUSIC_TAB_KEYBIND_VARBIT_ID,
            SettingStructs.EQUIPMENT_TAB_KEYBIND_STRUCT_ID to EQUIPMENT_TAB_KEYBIND_VARBIT_ID,
            SettingStructs.LOGOUT_TAB_KEYBIND_STRUCT_ID to LOGOUT_TAB_KEYBIND_VARBIT_ID
      )

      val KEYBIND_SETTING_VARPS = emptyMap<Int, Int>()

      val COLOUR_SETTING_VARPS = mapOf(
            SettingStructs.OPAQUE_PUBLIC_CHAT_STRUCT_ID to OPAQUE_PUBLIC_CHAT_VARP_ID,
            SettingStructs.TRANSPARENT_PUBLIC_CHAT_STRUCT_ID to TRANSPARENT_PUBLIC_CHAT_VARP_ID,
            SettingStructs.OPAQUE_PRIVATE_CHAT_STRUCT_ID to OPAQUE_PRIVATE_CHAT_VARP_ID,
            SettingStructs.TRANSPARENT_PRIVATE_CHAT_STRUCT_ID to TRANSPARENT_PRIVATE_CHAT_VARP_ID,
            SettingStructs.SPLIT_PRIVATE_CHAT_STRUCT_ID to SPLIT_PRIVATE_CHAT_VARP_ID,
            SettingStructs.OPAQUE_AUTO_CHAT_STRUCT_ID to OPAQUE_AUTO_CHAT_VARP_ID,
            SettingStructs.TRANSPARENT_AUTO_CHAT_STRUCT_ID to TRANSPARENT_AUTO_CHAT_VARP_ID,
            SettingStructs.OPAQUE_BROADCAST_STRUCT_ID to OPAQUE_BROADCAST_VARP_ID,
            SettingStructs.TRANSPARENT_BROADCAST_STRUCT_ID to TRANSPARENT_BROADCAST_VARP_ID,
            SettingStructs.SPLIT_BROADCAST_STRUCT_ID to SPLIT_BROADCAST_VARP_ID,
            SettingStructs.OPAQUE_FRIEND_CHAT_STRUCT_ID to OPAQUE_FRIEND_CHAT_VARP_ID,
            SettingStructs.TRANSPARENT_FRIEND_CHAT_STRUCT_ID to TRANSPARENT_FRIEND_CHAT_VARP_ID,
            SettingStructs.OPAQUE_CLAN_CHAT_STRUCT_ID to OPAQUE_CLAN_CHAT_VARP_ID,
            SettingStructs.TRANSPARENT_CLAN_CHAT_STRUCT_ID to TRANSPARENT_CLAN_CHAT_VARP_ID,
            SettingStructs.OPAQUE_INCOMING_TRADE_REQUEST_STRUCT_ID to OPAQUE_INCOMING_TRADE_REQUEST_VARP_ID,
            SettingStructs.TRANSPARENT_INCOMING_TRADE_REQUEST_STRUCT_ID to TRANSPARENT_INCOMING_TRADE_REQUEST_VARP_ID,
            SettingStructs.OPAQUE_INCOMING_CHALLENGE_REQUEST_STRUCT_ID to OPAQUE_INCOMING_CHALLENGE_REQUEST_VARP_ID,
            SettingStructs.TRANSPARENT_INCOMING_CHALLENGE_REQUEST_STRUCT_ID to TRANSPARENT_INCOMING_CHALLENGE_REQUEST_VARP_ID,
            SettingStructs.OPAQUE_GUEST_CLAN_CHAT_STRUCT_ID to OPAQUE_GUEST_CLAN_CHAT_VARP_ID,
            SettingStructs.TRANSPARENT_GUEST_CLAN_CHAT_STRUCT_ID to TRANSPARENT_GUEST_CLAN_CHAT_VARP_ID,
            SettingStructs.TILE_HIGHLIGHT_COLOUR_STRUCT_ID to TILE_HIGHLIGHT_COLOUR_VARP_ID,
            SettingStructs.HIGHLIGHT_HOVERED_TILE_COLOUR_STRUCT_ID to HIGHLIGHT_HOVERED_TILE_COLOUR_VARP_ID,
            SettingStructs.HIGHLIGHT_CURRENT_TILE_COLOUR_STRUCT_ID to HIGHLIGHT_CURRENT_TILE_COLOUR_VARP_ID,
            SettingStructs.HIGHLIGHT_DESTINATION_TILE_COLOUR_STRUCT_ID to HIGHLIGHT_DESTINATION_TILE_COLOUR_VARP_ID,
            SettingStructs.OPAQUE_IRON_GROUP_BROADCASTS_STRUCT_ID to OPAQUE_IRON_GROUP_BROADCASTS_VARP_ID,
            SettingStructs.TRANSPARENT_IRON_GROUP_BROADCASTS_STRUCT_ID to TRANSPARENT_IRON_GROUP_BROADCASTS_VARP_ID,
            SettingStructs.TRANSPARENT_IRON_GROUP_CHAT_STRUCT_ID to TRANSPARENT_IRON_GROUP_CHAT_VARP_ID,
            SettingStructs.TRANSPARENT_CLAN_BROADCASTS_STRUCT_ID to TRANSPARENT_CLAN_BROADCASTS_VARP_ID,
            SettingStructs.OPAQUE_CLAN_BROADCASTS_STRUCT_ID to OPAQUE_CLAN_BROADCASTS_VARP_ID,
            SettingStructs.OPAQUE_IRON_GROUP_CHAT_STRUCT_ID to OPAQUE_IRON_GROUP_CHAT_VARP_ID,
            SettingStructs.COMPLETED_QUEST_TEXT_COLOUR_STRUCT_ID to COMPLETED_QUEST_TEXT_COLOUR_VARP_ID,
            SettingStructs.UNAVAILABLE_QUEST_TEXT_COLOUR_STRUCT_ID to UNAVAILABLE_QUEST_TEXT_COLOUR_VARP_ID,
            SettingStructs.UNSTARTED_QUEST_TEXT_COLOUR_STRUCT_ID to UNSTARTED_QUEST_TEXT_COLOUR_VARP_ID,
            SettingStructs.IN_PROGRESS_QUEST_TEXT_COLOUR_STRUCT_ID to IN_PROGRESS_QUEST_TEXT_COLOUR_VARP_ID
      )

      val COLOUR_SETTING_VARBITS = emptyMap<Int, Int>()

      val ALL_VARP_SETTINGS = listOf(
            TOGGLE_SETTINGS_VARPS, SLIDER_SETTING_VARPS, DROPDOWN_SETTING_VARPS, COLOUR_SETTING_VARPS, KEYBIND_SETTING_VARPS
      )

      val ALL_VARBIT_SETTINGS = listOf(
            TOGGLE_SETTING_VARBITS, SLIDER_SETTING_VARBITS, DROPDOWN_SETTING_VARBITS, KEYBIND_SETTING_VARBITS, COLOUR_SETTING_VARBITS
      )

      fun getVariableValue(setting: Setting, player: Player): Int {
            val type = setting.getType()
            when(type) {
                  SettingType.TOGGLE -> {
                        return getVariableValue(setting, player, TOGGLE_SETTINGS_VARPS, TOGGLE_SETTING_VARBITS)
                  }
                  SettingType.SLIDER -> {
                        return getVariableValue(setting, player, SLIDER_SETTING_VARPS, SLIDER_SETTING_VARBITS)
                  }
                  SettingType.DROPDOWN -> {
                        return getVariableValue(setting, player, DROPDOWN_SETTING_VARPS, DROPDOWN_SETTING_VARBITS)
                  }
                  SettingType.KEYBIND -> {
                        return getVariableValue(setting, player, KEYBIND_SETTING_VARPS, KEYBIND_SETTING_VARBITS)
                  }
                  SettingType.COLOUR -> {
                        return getVariableValue(setting, player, COLOUR_SETTING_VARPS, COLOUR_SETTING_VARBITS)
                  }
                  else -> {
                        throw IllegalArgumentException("Setting '" + setting.getId() + "' uses unsupported type '" + type + "'.")
                  }
            }
      }

      fun setVariableValue(setting: Setting, player: Player, value : Int) {
            val type = setting.getType()
            when(type) {
                  SettingType.TOGGLE -> {
                        setVariableValue(setting, player, value, TOGGLE_SETTINGS_VARPS, TOGGLE_SETTING_VARBITS)
                  }
                  SettingType.SLIDER -> {
                        setVariableValue(setting, player, value, SLIDER_SETTING_VARPS, SLIDER_SETTING_VARBITS)
                  }
                  SettingType.DROPDOWN -> {
                        setVariableValue(setting, player, value, DROPDOWN_SETTING_VARPS, DROPDOWN_SETTING_VARBITS)
                  }
                  SettingType.KEYBIND -> {
                        setVariableValue(setting, player, value, KEYBIND_SETTING_VARPS, KEYBIND_SETTING_VARBITS)
                  }
                  SettingType.COLOUR -> {
                        setVariableValue(setting, player, value, COLOUR_SETTING_VARPS, COLOUR_SETTING_VARBITS)
                  }
                  else -> {
                        throw IllegalArgumentException("Setting '" + setting.getId() + "' uses unsupported type '" + type + "'.")
                  }
            }
      }

      private fun getVariableValue(
            setting: Setting,
            player: Player,
            varps: Map<Int, Int>,
            varbits: Map<Int, Int>
      ): Int {
            val varp = varps[setting.getStructId()]
            if (varp != null) {
                  return player.getVarp(varp)
            }
            val varbit = varbits[setting.getStructId()]
                  ?: throw IllegalStateException("Setting '" + setting.getId() + "' does not define a variable.")
            return player.getVarbit(varbit)
      }

      private fun setVariableValue(
            setting: Setting,
            player: Player,
            value: Int,
            varps: Map<Int, Int>,
            varbits: Map<Int, Int>
      ) {
            val varp = varps.get(setting.getStructId())
            if (varp != null) {
                  player.setVarp(varp, value)
                  logger.info("Setting Varp: {} with value: {}", varp, value)
                  return
            }
            val varbit = varbits.get(setting.getStructId())
                  ?: throw IllegalStateException("Setting '" + setting.getId() + "' does not define a variable.")

            logger.info("Setting Varbit: {} with value: {}", varbit, value)
            player.setVarbit(varbit, value)
      }
}
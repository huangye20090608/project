package com.huangye.Trainning.enumService;

public enum PropertiesConfigGroupIdEnum {
	TITLE("TITLE","标题相关"),
    TRADE("TRADE","交易相关"),
    DOMAIN("DOMAIN","域名相关"),
    SYSTEM("SYSTEM","系统相关"),
    PAYMENT("PAYMENT","交易相关"),
    COPYRIGHT("COPYRIGHT","版权相关"),
    MALL("MALL","商城相关");

    private String groupId;
    private String describe;

    PropertiesConfigGroupIdEnum(String groupId, String describe) {
        this.groupId = groupId;
        this.describe = describe;
    }

    public static String getDesc(String groupId) {
        for (PropertiesConfigGroupIdEnum configGroupIdEnum : PropertiesConfigGroupIdEnum.values()) {
            if(groupId != null && groupId.equals(configGroupIdEnum.getGroupId())){
                return configGroupIdEnum.getDescribe();
            }
        }
        return null;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}

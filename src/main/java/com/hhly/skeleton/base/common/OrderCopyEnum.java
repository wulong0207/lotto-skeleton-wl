package com.hhly.skeleton.base.common;

/**
 * @author lgs on
 * @version 1.0
 * @desc 抄单枚举
 * @date 2017/9/22.
 * @company 益彩网络科技有限公司
 */
public class OrderCopyEnum {

    public enum OrderVisibleTypeEnum {
        DRAW_SHOW(1, "开奖后可见"),
        ALL_SHOW(2, "全部可见"),
        SPECIFY_SHOW(3, "抄单后可见"),
        FOLLOW_SHOW(4, "关注人可见"),;
        private int value;
        private String desc;

        OrderVisibleTypeEnum(int value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public enum DataStatusEnum {
        NOT_TICK(1, "未出票"),
        TICK(2, "已出票");
        private int value;
        private String desc;

        DataStatusEnum(int value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }



    public enum OrderByTypeEnum {
        /**
         * 降序
         */
        DESC("DESC"),
        /**
         * 升序
         */
        ASC("ASC");
        private String value;

        OrderByTypeEnum() {
        }

        OrderByTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    /**
     * 推荐内容是否显示
     */
    public enum IsShowEnum {
        HIDE(0, "隐藏"),
        SHOW(1, "显示");
        private int value;
        private String desc;

        IsShowEnum(int value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}

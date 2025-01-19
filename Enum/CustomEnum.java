public enum CustomEnum {
    MONDAY(1, "Monday"),
    TUESDAY(2, "Tuesday"),
    WEDNESDAY(3, "Wednesday");
    private int val;
    private String comment;
    CustomEnum(int val, String comment) {
        this.val = val;
        this.comment =comment;
    }
    public int getVal() {
        return val;
    }
    public String getComment() {
        return comment;
    }
    public static CustomEnum getEnum(int val) {
        for (CustomEnum customEnum : values()) {
            if (customEnum.getVal() == val) {
                return customEnum;
            }
        }
        return null;
    }
}

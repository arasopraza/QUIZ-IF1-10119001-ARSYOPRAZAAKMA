public interface ServiceItem {
    public abstract void displayService();
    public abstract float getPrice(int serviceItem);
    public abstract boolean checkMemberStatus(String statusMember);
    public abstract float getSale(boolean isMember, float parServicePrice);
}

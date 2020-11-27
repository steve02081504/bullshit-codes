public class EventBusSample {
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void Event(MessageAreaDialog messageEvent) {
        //高级写法
        area_tv.setText(MessageAreaDialog.adress);
        provinceid = MessageAreaDialog.provinceid;
        cityid = MessageAreaDialog.cityid;
    }
}

package pattern.creation.singleton.enumsingleton;

public enum  EnumSingleton {
    INSTANCE{
        @Override
        protected void testPrint(){
            System.out.println("Caoxin test Print");
        }
    };

    protected abstract void testPrint();
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}

public class TestCase {

    // поля задаваемые для класса
    private int id;
    private String title;
    private String status;


    private static int count = 0;

    //  Конструктор
    public TestCase(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = "NOT_RUN";
        count++;
    }

    // getteri
    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getStatus() {
        return this.status;
    }

    // setteri
    public void setStatus(String status) {
        if (status.equals("PASSED") || status.equals("FAILED") || status.equals("SKIPPED")) {
            this.status = status;
        } else {
            System.out.println("Error: invalid status '" + status + "'");
        }
    }

    public static int getCount() {
        return count;
    }

    // describe()
    public String describe() {
        return "#" + this.id + " " + this.title + " [" + this.status + "]";
    }

    public static void main(String[] args) {
        // TCs
        TestCase t1 = new TestCase(1, "Login with valid user");
        TestCase t2 = new TestCase(2, "Login with invalid password");
        TestCase t3 = new TestCase(3, "Logout");

        t1.setStatus("PASSED");
        t2.setStatus("FAILED");
        t3.setStatus("SKIPPED");

        System.out.println(t1.describe());
        System.out.println(t2.describe());
        System.out.println(t3.describe());

        System.out.println("Created test cases: " + TestCase.getCount());
    }
}
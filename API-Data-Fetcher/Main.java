public class Main {
    public static void main(String[] args) {
        APIclient client = new APIclient("https://jsonplaceholder.typicode.com/todos/1");
        String response = client.fetchData();

        System.out.println("API response:");
        System.out.println(response);
    }
}

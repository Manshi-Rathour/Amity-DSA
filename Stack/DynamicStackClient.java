package Stack;

public class DynamicStackClient {
    public static void main(String[] args) throws Exception {
        DynamicStack st = new DynamicStack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        st.display();
    }
}

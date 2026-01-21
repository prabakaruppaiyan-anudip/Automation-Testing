package basics;

class ForEachDemo {
    public static void main(String args[]) {
        int marks[] = {85, 90, 75, 88, 92};

        System.out.println("Displaying Student Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}

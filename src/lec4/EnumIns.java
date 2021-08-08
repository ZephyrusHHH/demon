package lec4;
//https://blog.csdn.net/qq_27093465/article/details/52180865?t=1505186605347&utm_medium=distribute.pc_relevant.none-task-blog-2~default~baidujs_baidulandingword~default-0.pc_relevant_baidujshouduan&spm=1001.2101.3001.4242
public class EnumIns {
    public enum Color {
        RED, GREEN, BLANK, YELLOW
    }


    public enum IdColor {
        RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
        private String name;
        private int index;

        private IdColor(String name, int index) {
            this.name = name;
            this.index = index;
        }
    }

    public static void signal() {
        Color color = Color.GREEN;
        switch (color) {
            case RED -> System.out.println(color.name());
            case GREEN -> System.out.println(color.ordinal());
            case YELLOW -> System.out.println("slow down");
        }
    }

    public static void main(String[] args) {
        signal();
    }
}

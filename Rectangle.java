class Rect {
    float length;
    float width;

    void values(float l, float w) {
        length = l;
        width = w;
    }

    void perimeter() {
        float p = 2 * (length + width);
        System.out.println(p);
    }

    void area() {
        float a = (length * width);
        System.out.println(a);
    }
}

    public class Rectangle {
        public static void main(String[] args) {
            Rect rect = new Rect();
            rect.values(20, 10);
            rect.perimeter();
            rect.area();
        }

    }



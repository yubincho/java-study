package supercoding.제네릭3;

public class Point<T, V>{

    private T x;
    private V y;


    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    // 거리 구하기
    public Double calculateDistance() {
        if (!(this.x instanceof Number)) {  // instanceof: 타입 검사
            return null;
        }
        if (!(this.y instanceof Number)) {  // instanceof: 타입 검사
            return null;
        }

        Double num1 = ((Number) this.x).doubleValue();
        Double num2 = ((Number) this.y).doubleValue();

        return Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));

    }

}

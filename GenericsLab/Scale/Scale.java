package Scale;


// Везната (Scale) да  работи със върпосният тип, искам да съдържа метода CompareTo,
// за да могат да се сравняват
public class Scale<T extends Comparable<T>> {

    private T left;
    private T right;

    public Scale(T left, T right) {
        // Създава нова везна
        this.left = left;
        this.right = right;
    }
    public T getHeavier() {
        // compareTo - метод Сравнява стойности( резултатите, 1, 0 , -1)
        // result = 0 -> el1 == el2
        // result = 1 -> el1 > el2
        // result = -1 -> el1 < el2

        if(this.left.compareTo(this.right) > 0) {
            return this.left;
        }
        if(this.left.compareTo(this.right) < 0) {
            return this.right;
        }
        return null;
    }
}

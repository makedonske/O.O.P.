import java.util.Objects;

public class Location
{
    //Координата х
    public int xCoord;

    // Координата у
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    // переопределяем метод базового класса

    @Override
    // Сравнение объектов
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return xCoord == location.xCoord && yCoord == location.yCoord;
    }

    @Override
    //Генирация целочисленного кода объекта
    public int hashCode() {
        return Objects.hash(xCoord, yCoord);
    }
}

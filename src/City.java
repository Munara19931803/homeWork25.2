import java.util.Comparator;
import java.util.Objects;

public class City {
    private int code;
    private String name;

    public City() {
    }

    Comparator<City> comparator = new Comparator<City>() {
        @Override
        public int compare(City o1, City o2) {
            return o1.code - o2.getCode();
        }
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return code == city.code && Objects.equals(name, city.name) && Objects.equals(comparator, city.comparator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, comparator);
    }

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}

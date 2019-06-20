package taskfiles.util;

import taskfiles.model.entity.Gemstone;
import taskfiles.model.entity.OrganicStone;
import taskfiles.model.entity.Stone;
import taskfiles.model.entity.TypesOfStones;
import taskfiles.model.exception.ValueException ;

public class Factory {

    private Factory() {

    }

    public static Stone getStoneFromString(String[] arr) throws ValueException {
        Stone stone;
        if (arr.length >= 6 && arr.length <= 7) {
            switch (TypesStones.valueOf(arr[0].toUpperCase())) {
                case GEMSTONE:
                    stone = new Gemstone(arr[1], Double.valueOf(arr[2]), Double.valueOf(arr[3]),
                            Double.valueOf(arr[4]), arr[5], arr[6]);
                    break;
                case ORGANICSTONE:
                    stone = new OrganicStone(arr[1], Double.valueOf(arr[2]), Double.valueOf(arr[3]),
                            Double.valueOf(arr[4]), arr[5], Double.valueOf(arr[6]));
                    break;
                case STONE:
                    stone = new Stone(arr[1], Double.valueOf(arr[2]), Double.valueOf(arr[3]), Double.valueOf(arr[4]),
                            arr[5]);
                default:
                    throw new ValueException ("Incorrect values");
            }
        } else {
            throw new ValueException ("Invalid number");
        }
        return stone;
    }
}

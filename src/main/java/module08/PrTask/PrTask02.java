package module08.PrTask;

enum Color {
    WHITE,RED,BLUE
}

enum Type {
    GRASS,BUSH,TREE
}

class ColorExeption extends Exception{
    public ColorExeption(String message){
        super(message);
    }
}

class TypeExeption extends Exception{
    public TypeExeption(String message){
        super(message);
    }
}

public class Plant{
    private Type type;
    private Color color;
    private int size;
    public Plant(String type, String color, int size)
            throws ColorExeption,TypeExeption
    {

        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.type=t;
        this.color=c;
        this.size=size;

    }

    private Type typeStrToEnum(String type)
                throws TypeExeption
    {
        return null;
    }

    private Color colorStrToEnum(String colorStr) throws ColorExeption {
        for (var c : Color.values())
        {
            if(colorStr.equalsIgnoreCase(color.name()))
                {
                return color;
                }
        }
        throw new ColorExeption("Invalid color");


    }
}

public class PrTask02 {
//
}



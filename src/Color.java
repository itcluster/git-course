public class Color
{
private int red;
private int green;
private int blue;

public void reduce()
{
 red = (red * 6 / 256) * 51;
 green = (green * 6 / 256) * 51;
 blue = (blue * 6 / 256) * 51;
}
}

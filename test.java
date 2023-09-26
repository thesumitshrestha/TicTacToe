package p_9_10_23;
public class Rectangle
{
  private double length;
  private double width;
  private static int instanceCount=0;
  public Rectangle() {
  length=0;
  width=0; 
  instanceCount++;
  }
 
  public Rectangle(double len, double w) {
   length=len;
   width=w;
   instanceCount++;
   }
   public Rectangle(Rectangle r) {
   length=r.length;
   width=r.width; 
  }
  public void setLength(double length) {
   this.length =length;
  } 
   public void setWidth(double w) {
   width=w;
  } 
  public double getLength() {
   return length;
  } 
  public double getWidth() {
   return width;
  } 
  public double getArea() {
   return length*width; 
  }
  public int instancecount() {
   return instanceCount;
  }
  public static double getArea(double customLength, double customWidth) {
  return customLength*customWidth; 
 }
}

package designPattern.abstractfactory;

public class ColorFactory extends AbstractFactory {
	
	   @Override
	   public Shape getShape(String shapeType){
	      return null;
	   }
	   
	   @Override
	   Color getColor(String color) {
	   
	      if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("red")){
	         return new Red();
	         
	      }else if(color.equalsIgnoreCase("green")){
	         return new Green();
	         
	      }else if(color.equalsIgnoreCase("blue")){
	         return new Blue();
	      }
	      
	      return null;
	   }
	  	
}
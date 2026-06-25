public class ShapeReport {
    public static void printAreaReport(Shape[] shapes) {
        System.out.println("===============================================");
        System.out.println("                  SHAPE AREA REPORT");
        System.out.println("===============================================");
        System.out.printf("%-15s %-15s %-15s%n", "Shape", "Area", "Perimeter");
        System.out.println("-----------------------------------------------");
        
        double totalArea = 0;
        for (Shape shape : shapes) {
            System.out.printf("%-15s %-15.2f %-15.2f%n", 
                shape.getShapeName(), 
                shape.area(), 
                shape.perimeter());
            totalArea += shape.area();
        }
        
        System.out.println("-----------------------------------------------");
        System.out.printf("%-15s %-15.2f%n", "Total Area", totalArea);
        System.out.println("===============================================");
    }
}

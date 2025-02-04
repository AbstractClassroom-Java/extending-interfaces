# Shapes Package

The `Shapes` package demonstrates how interfaces can be extended and implemented in Java to create a flexible and modular object-oriented design. This package consists of multiple sub-packages containing interfaces and classes that model various geometric shapes.

## Interface Extension in Java

In Java, interfaces can extend other interfaces, allowing for hierarchical relationships that enable more structured and reusable designs. This approach promotes abstraction and ensures that classes implementing these interfaces conform to specific behaviors.

### Overview of Interface Relationships

- **IShape**: A base interface representing any geometric shape.
- **IPolygon**: Extends `IShape`, representing polygonal shapes.
- **IRegularPolygon**: Extends `IPolygon`, adding constraints for regular polygons.
- **ITriangle**: Extends `IPolygon`, providing a default method `getNumberOfSides()` that returns 3.
- **IEllipse**: Extends `IShape`, representing elliptical shapes.
- **ICircle**: Extends `IEllipse`, representing circles.
- **IRectangle**: Extends `IPolygon`, representing rectangles.

### Overview of Implementations

- **EqTriangle**: Implements both `IRegularPolygon` and `ITriangle`, demonstrating multiple interface implementations.
- **Circle**: Implements `ICircle`, showcasing how circles conform to the elliptical shape hierarchy.
- **Rectangle**: Implements `IRectangle`, modeling general rectangles.
- **Square**: Extends `Rectangle` and implements `IRegularPolygon`, ensuring squares inherit rectangle properties while conforming to the regular polygon constraints.

This structure showcases the power of interface extension, enabling shared behavior while allowing specific characteristics to be defined for each shape type.


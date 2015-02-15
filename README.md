BuilderPattern
==============

Sexy pattern in Java. Will change your way of building objects.

## Usage

```java
List<RubiksCube> rubiksList = new ArrayList<RubiksCube>();
		
rubiksList.add(new RubiksCube.Builder()
		.withName("NicsCube")
		.withSize(RubiksCubeHelper.Size._7x7)
		.withType(RubiksCubeHelper.Type.REGULAR)
		.build());
```



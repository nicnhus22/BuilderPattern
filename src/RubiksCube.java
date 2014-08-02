
public class RubiksCube {

	private String name;
	private String type;
	private String size;
	
	public RubiksCube(Builder builder) {
		this.name = builder.name;
		this.size = builder.size;
		this.type = builder.type;
	}
	
	private static class Builder {
		
		private String name;
		private String type;
		private String size;
		
		public Builder(){
			this.name = "default";
			this.type = RubiksCubeHelper.Type.REGULAR;
			this.size = RubiksCubeHelper.Size._3x3;
		}
		
		public Builder withName(String name){
			this.name = name;
			return this;
		}
		
		public Builder withSize(RubiksCubeHelper.Size size){
			this.size = size.toString();
			return this;
		}
		
		public Builder withType(RubiksCubeHelper.Type type){
			this.type = type.toString();
			return this;
		}
		
		public RubiksCube build(){
			return new RubiksCube(this);
		}
		
	}
}

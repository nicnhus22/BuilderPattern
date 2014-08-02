
public class RubiksCube {

	private String name;
	private String type;
	private String size;
	
	public RubiksCube(Builder builder) {
		this.name = builder.name;
		this.size = builder.size;
		this.type = builder.type;
	}
	
	public static class Builder {
		
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
		
		public Builder withSize(String size){
			this.size = size.toString();
			return this;
		}
		
		public Builder withType(String type){
			this.type = type.toString();
			return this;
		}
		
		public RubiksCube build(){
			return new RubiksCube(this);
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}

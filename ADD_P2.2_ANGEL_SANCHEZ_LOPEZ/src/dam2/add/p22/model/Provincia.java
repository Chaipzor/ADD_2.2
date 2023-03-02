package dam2.add.p22.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Provincia {

	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("nm")
	@Expose
	private String nm;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

}

package icity.cgmp.info;

import java.io.Serializable;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbsInfo implements Serializable {

	private static ObjectMapper mapper = new ObjectMapper();

	/** serialVersionUID */
	private static final long serialVersionUID = 5901264457256849540L;

	@Override
	public String toString() {
		try {
			String jsonString = mapper.writeValueAsString(this);
			return jsonString;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			return super.toString();
		}
	}
}
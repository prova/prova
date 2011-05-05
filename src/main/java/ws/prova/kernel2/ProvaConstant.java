package ws.prova.kernel2;

import ws.prova.kernel2.typing.ProvaType;

public interface ProvaConstant extends ProvaObject {

	public Object getObject();

	public void setObject(Object object);

	public boolean matched(ProvaConstant target);
	
	public ProvaType getType();

}

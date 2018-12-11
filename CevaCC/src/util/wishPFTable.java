package util;

import java.io.IOException;

import javax.faces.component.NamingContainer;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.FacesContext;

public class wishPFTable extends HtmlDataTable implements NamingContainer {
	public String getFamily() {
		return "javax.faces.NamingContainer";
	}

	public void encodeBegin(FacesContext context) throws IOException {

		test(context, this);

		super.encodeBegin(context);

	}

//	public Object getSubmittedValue() {
//		return this;
//	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.faces.component.UIComponentBase#getRendersChildren()
	 */
	@Override
	public boolean getRendersChildren() {
		// TODO Auto-generated method stub
		return true;
	}
//
//	/*
//	 * (non-Javadoc)
//	 * 
//	 * @see
//	 * javax.faces.component.UIComponentBase#encodeChildren(javax.faces.context.
//	 * FacesContext)
//	 */
//	@Override
//	public void encodeChildren(FacesContext arg0) throws IOException {
//		super.encodeChildren(arg0);
//	
//	}
//
//	/* (non-Javadoc)
//	 * @see javax.faces.component.UIComponentBase#encodeEnd(javax.faces.context.FacesContext)
//	 */
//	@Override
//	public void encodeEnd(FacesContext arg0) throws IOException {
//		super.encodeEnd(arg0);
//	}

	public void test(FacesContext context, UIComponent component) throws IOException {
		UIComponent compositeFacet = (UIComponent) component.getFacet(UIComponent.COMPOSITE_FACET_NAME);

		compositeFacet.getChildren().get(0).getChildren()
				.add(compositeFacet.getChildren().get(0).getChildren().remove(0));
		
		compositeFacet.getChildren().get(0).getChildren().remove(0);


	}

}
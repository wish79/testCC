package util;

import com.corejsf.util.Messages;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIComponent;
import javax.faces.component.UIData;
import javax.faces.component.UIInput;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;

public class wishTable extends HtmlDataTable implements NamingContainer {
	public String getFamily() {
		return "javax.faces.NamingContainer";
	}

	public void encodeBegin(FacesContext context) throws IOException {

        UIComponent mohammadComponent =  findComponent(getClientId()+":mohammadCol");
        if(mohammadComponent != null) {
        	getChildren().add(mohammadComponent);	
        }
        
        test(context, this);
        
//      mohammadComponent.setRendered(false);
//        getChildren().get(0).encodeAll(context);
		super.encodeBegin(context);
//		getChildren().get(0).encodeAll(context);

	}

	public Object getSubmittedValue() {
		return this;
	}

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.faces.component.UIComponentBase#encodeChildren(javax.faces.context.
	 * FacesContext)
	 */
	@Override
	public void encodeChildren(FacesContext arg0) throws IOException {
		// TODO Auto-generated method stub
		UIComponent mohammadComponent =  findComponent(getClientId()+":mohammadCol");

		super.encodeChildren(arg0);
//		myEncodeAll(arg0);
		
		UIComponent mohammadComponent2 =  findComponent(getClientId()+":mohammadCol");
			
	}

	/* (non-Javadoc)
	 * @see javax.faces.component.UIComponentBase#encodeEnd(javax.faces.context.FacesContext)
	 */
	@Override
	public void encodeEnd(FacesContext arg0) throws IOException {
		// TODO Auto-generated method stub
		UIComponent mohammadComponent2 =  findComponent(getClientId()+":mohammadCol");
		super.encodeEnd(arg0);
		UIComponent mohammadComponent =  findComponent(getClientId()+":mohammadCol");
		getChildCount();
	}
	
    public void myEncodeAll(FacesContext context) throws IOException {



            for (UIComponent kid : getChildren()) {
                kid.encodeAll(context);
            }
     



    }
	
    
    public void test(FacesContext context, UIComponent component)
            throws IOException
    {
        UIComponent compositeFacet = (UIComponent) component.getFacet(UIComponent.COMPOSITE_FACET_NAME);
        
        compositeFacet.getChildren().get(0).getChildren().add(compositeFacet.getChildren().get(0).getChildren().remove(0));

    }
	

}
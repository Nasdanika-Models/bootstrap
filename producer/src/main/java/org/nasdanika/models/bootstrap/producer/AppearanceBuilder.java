package org.nasdanika.models.bootstrap.producer;

import org.nasdanika.html.HTMLElement;
import org.nasdanika.html.bootstrap.BootstrapElement;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Placement;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.html.bootstrap.Text.Alignment;
import org.nasdanika.html.bootstrap.Text.Transform;
import org.nasdanika.html.bootstrap.Text.Weight;
import org.nasdanika.models.bootstrap.Appearance;
import org.nasdanika.models.bootstrap.Border;
import org.nasdanika.models.bootstrap.Float;
import org.nasdanika.models.bootstrap.Spacing;
import org.nasdanika.models.bootstrap.Text;

public class AppearanceBuilder  {
	
	private Appearance appearance;
	
	public AppearanceBuilder(Appearance appearance) {
		this.appearance = appearance;
	}
	
	private java.util.function.Consumer<HTMLElement<?>> backgroundBuilder = htmlElement -> {
		Color background = appearance.getBackground();
		if (background != null) {
			BootstrapElement<?, ?> bootstrapElement = BootstrapFactory.INSTANCE.wrap(htmlElement);
			bootstrapElement.background(background);
		}							
	};
	
	private java.util.function.Consumer<HTMLElement<?>> borderBuilder = htmlElement -> {
		BootstrapElement<?, ?> bootstrapElement = BootstrapFactory.INSTANCE.wrap(htmlElement);
		for (Border border: appearance.getBorder()) {
			Color color = border.getColor();
			if (border.isBottom() || border.isLeft() || border.isRight() || border.isTop()) {
				if (border.isBottom()) {
					bootstrapElement.border(color, Placement.BOTTOM);
				}
				if (border.isTop()) {
					bootstrapElement.border(color, Placement.TOP);
				}
				if (border.isLeft()) {
					bootstrapElement.border(color, Placement.LEFT);
				}
				if (border.isRight()) {
					bootstrapElement.border(color, Placement.RIGHT);
				}
			} else {
				bootstrapElement.border(color);				
			}				
		} 
		Color bgColor = appearance.getBackground();
		if (bgColor != null) {
			bootstrapElement.background(bgColor);
		}							
	};

	private java.util.function.Consumer<HTMLElement<?>> spacingBuilder = htmlElement -> {
		BootstrapElement<?, ?> bootstrapElement = BootstrapFactory.INSTANCE.wrap(htmlElement);
		for (Spacing margin : appearance.getMargin()) {
			Size size = margin.getSize();
			Breakpoint breakpoint = margin.getBreakpoint();
			if (breakpoint == null) {
				breakpoint = Breakpoint.DEFAULT;
			}
			
			if (margin.isBottom() || margin.isLeft() || margin.isRight() || margin.isTop() || margin.isX() || margin.isY()) {
				if (margin.isBottom()) {
					bootstrapElement.margin().bottom(breakpoint, size);
				}
				if (margin.isTop()) {
					bootstrapElement.margin().top(breakpoint, size);
				}
				if (margin.isLeft()) {
					bootstrapElement.margin().left(breakpoint, size);
				}
				if (margin.isRight()) {
					bootstrapElement.margin().right(breakpoint, size);
				}
				
				if (margin.isX()) {
					bootstrapElement.margin().x(breakpoint, size);
				}
				if (margin.isY()) {
					bootstrapElement.margin().y(breakpoint, size);
				}						
			} else {
				bootstrapElement.margin().all(breakpoint, size);				
			}					
		} 

		for (Spacing padding : appearance.getPadding()) {
			Size size = padding.getSize();
			Breakpoint breakpoint = padding.getBreakpoint();
			if (breakpoint == null) {
				breakpoint = Breakpoint.DEFAULT;
			}
			
			if (padding.isBottom() || padding.isLeft() || padding.isRight() || padding.isTop() || padding.isX() || padding.isY()) {
				if (padding.isBottom()) {
					bootstrapElement.padding().bottom(breakpoint, size);
				}
				if (padding.isTop()) {
					bootstrapElement.padding().top(breakpoint, size);
				}
				if (padding.isLeft()) {
					bootstrapElement.padding().left(breakpoint, size);
				}
				if (padding.isRight()) {
					bootstrapElement.padding().right(breakpoint, size);
				}
				
				if (padding.isX()) {
					bootstrapElement.padding().x(breakpoint, size);
				}
				if (padding.isY()) {
					bootstrapElement.padding().y(breakpoint, size);
				}						
			} else {
				bootstrapElement.padding().all(breakpoint, size);
			}
		}
		
	};
	
	private java.util.function.Consumer<HTMLElement<?>> textBuilder = htmlElement -> {
		BootstrapElement<?, ?> bootstrapElement = BootstrapFactory.INSTANCE.wrap(htmlElement);
		Text text = appearance.getText();
		if (text != null) {
			org.nasdanika.html.bootstrap.Text<?> bsText = bootstrapElement.text();

			Color color = text.getColor();
			if (color != null) {						
				bsText.color(color);
			}
			
			Alignment alignment = text.getAlignment();
			if (alignment != null) {						
				bsText.alignment(alignment);
			}				

			Transform transform = text.getTransform();
			if (transform != null) {						
				bsText.transform(transform);
			}				

			Weight weight = text.getWeight();
			if (weight != null) {						
				bsText.weight(weight);
			}				
			
			bsText.monospace(text.isMonospace());
			bsText.italic(text.isItalic());
			bsText.nowrap(text.isNowrap());
			bsText.truncate(text.isTruncate());
			
		}
	};
			
	private java.util.function.Consumer<HTMLElement<?>> floatBuilder = htmlElement -> {
		BootstrapElement<?, ?> bootstrapElement = BootstrapFactory.INSTANCE.wrap(htmlElement);
		for (Float _float: appearance.getFloat()) {
			org.nasdanika.html.bootstrap.Float<?> bsFloat = bootstrapElement._float();
			Breakpoint breakpoint = _float.getBreakpoint();
			if (breakpoint == null) {
				breakpoint = Breakpoint.DEFAULT;
			}
			switch (_float.getSide()) {
			case "left":
				bsFloat.left(breakpoint);
				break;
			case "right":
				bsFloat.right(breakpoint);
				break;
			case "none":
				bsFloat.none(breakpoint);
				break;
			default:
				throw new IllegalArgumentException("Invalid float side: "+_float.getSide()+", shall be left, right, or none");
			}
		}
	};
	
	public void build(HTMLElement<?> htmlElement) {
		backgroundBuilder.accept(htmlElement);
		borderBuilder.accept(htmlElement);
		floatBuilder.accept(htmlElement);
		spacingBuilder.accept(htmlElement);
		textBuilder.accept(htmlElement);
	}
	
}

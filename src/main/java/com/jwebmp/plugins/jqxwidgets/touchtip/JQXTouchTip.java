/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.jqxwidgets.touchtip;

import com.jwebmp.core.base.html.Div;

/**
 * An implementation of the jsTree project.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
public class JQXTouchTip
		extends Div<JQXTouchTipChildren, JQXTouchTipAttributes, JQXTouchTipFeature, JQXTouchTipEvents, JQXTouchTip>
{


	private JQXTouchTipFeature feature;

	public JQXTouchTip()
	{
		addFeature(getFeature());
	}

	public JQXTouchTipFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXTouchTipFeature(this);
		}
		return feature;
	}

	@Override
	public JQXTouchTipOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQXTouchTip that = (JQXTouchTip) o;

		return getFeature().equals(that.getFeature());
	}
}

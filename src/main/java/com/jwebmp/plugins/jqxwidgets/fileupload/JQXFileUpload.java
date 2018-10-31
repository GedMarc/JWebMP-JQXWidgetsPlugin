/*
 * Copyright (C) 2017 Marc Magon
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
package com.jwebmp.plugins.jqxwidgets.fileupload;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxFileUpload is a widget which can be used to select files and upload them to a server. The file upload widget supports automatic upload and multiple files upload.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX File Upload",
		description = "jqxFileUpload is a widget which can be used to select files and upload them to a server. The file upload widget supports automatic upload and multiple files upload. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxfileupload/jquery-file-upload-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXFileUpload
		extends Div//<JQXFileUploadChildren, JQXFileUploadAttributes, JQXFileUploadFeature, JQXFileUploadEvents, JQXFileUpload>
{


	private JQXFileUploadFeature feature;

	public JQXFileUpload()
	{
		addFeature(getFeature());
	}

	public JQXFileUploadFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXFileUploadFeature(this);
		}
		return feature;
	}

	@Override
	public JQXFileUploadOptions getOptions()
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

		JQXFileUpload that = (JQXFileUpload) o;

		return getFeature().equals(that.getFeature());
	}
}

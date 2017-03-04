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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.bulletchart;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 *
 * @author MXM3727
 */
public class JQXBulletChartTicks extends JavaScriptPart
{

    private static final long serialVersionUID = 1L;
    /**
     * The actual position
     */
    private JQXBulletChartTickPosition position;
    /**
     * The relevant interval
     */
    private Integer interval;
    /**
     * The size of the ticks
     */
    private Integer size;

    public JQXBulletChartTicks(JQXBulletChartTickPosition position, Integer interval, Integer size)
    {
        this.position = position;
        this.interval = interval;
        this.size = size;
    }

    public JQXBulletChartTicks()
    {
    }

    public JQXBulletChartTickPosition getPosition()
    {
        return position;
    }

    public void setPosition(JQXBulletChartTickPosition position)
    {
        this.position = position;
    }

    public Integer getInterval()
    {
        return interval;
    }

    public void setInterval(Integer interval)
    {
        this.interval = interval;
    }

    public Integer getSize()
    {
        return size;
    }

    public void setSize(Integer size)
    {
        this.size = size;
    }

}

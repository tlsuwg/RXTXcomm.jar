package com.hitangjun.desk;

import java.awt.Color;
import java.awt.Dimension;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * @author John
 * @since Jul 29, 2010
 */
public class DynamicChart 
//implements Runnable
{
    XYSeries xySeries = new XYSeries("");
    XYSeriesCollection dataset = new XYSeriesCollection(xySeries);
    int step = 1;
    
    public XYSeries getXYSeries(){
    	return this.xySeries;
    }
    ChartPanel chartPanel ;
    public ChartPanel createChartpanel(){
     // super(new BorderLayout());
//        thread1 = new Thread(this);
//        lastValue = 100D;
        // 创建图表面板
        dataset.addSeries( xySeries );
        JFreeChart jfc = createChart(dataset);
        ChartPanel chartpanel = new ChartPanel(
                jfc);
        chartpanel.setPreferredSize(new Dimension(511, 270));
        chartpanel.setMouseZoomable(true, false);
        this.chartPanel = chartpanel;
        return chartpanel;
    }
    private XYPlot xyplot;
    
    public XYPlot getXYPlot(){
    	return xyplot;
    }
    
    private JFreeChart createChart(XYDataset xydataset) {
        JFreeChart jfreechart = ChartFactory.createXYLineChart("",
            "", "", xydataset, PlotOrientation.VERTICAL, false, false, false);
        xyplot = jfreechart.getXYPlot();
        
        // 纵坐标设定
        ValueAxis valueaxis = xyplot.getDomainAxis();
        valueaxis.setLowerBound( 1 );
        valueaxis.setRange( 1, 511D );
        
        //设置X轴是否可动态显示
        valueaxis.setAutoRange(false);
        //设置x轴的显示范围
        valueaxis.setFixedAutoRange(511D);
//        valueaxis.setAutoTickUnitSelection(false); // 由于横轴标签过多，这里设置为自动格式 
        
        valueaxis = xyplot.getRangeAxis();
        valueaxis.setRange(0.0D, 270D);
        XYLineAndShapeRenderer xylinerenderer = (XYLineAndShapeRenderer)xyplot.getRenderer();

        Color jeColor = new Color(9, 166, 89);
     
//       //设置数据点的颜色
        xylinerenderer.setSeriesPaint(0, jeColor); 
        return jfreechart;
    }

}

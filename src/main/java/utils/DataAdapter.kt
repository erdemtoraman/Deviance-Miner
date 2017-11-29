package utils

import org.jfree.data.statistics.HistogramDataset
import org.jfree.data.statistics.HistogramType

/**
 * Created by Erdem on 11-Nov-17.
 */

object DataAdapter{
    fun prepareHistogramData(data: DoubleArray, bins: Int): HistogramDataset {
        val histData = HistogramDataset()
        histData.type = HistogramType.FREQUENCY
        histData.addSeries("Histogram", data, bins)
        return histData
    }
}
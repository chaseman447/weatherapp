package weather.data.remote.response

data class CurrentWeather(
    val current: Current,
    val forecast: Forecast,
    val location: Location
)
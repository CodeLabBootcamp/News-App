package com.codelab.newsapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by SniperDW on 12/20/2016.
 */

public class Response {


    /**
     * query : {"count":1,"created":"2016-12-20T14:51:21Z","lang":"en-US","results":{"channel":{"units":{"distance":"mi","pressure":"in","speed":"mph","temperature":"F"},"title":"Yahoo! Weather - Sunnyvale, CA, US","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/","description":"Yahoo! Weather for Sunnyvale, CA, US","language":"en-us","lastBuildDate":"Tue, 20 Dec 2016 06:51 AM PST","ttl":"60","location":{"city":"Sunnyvale","country":"United States","region":" CA"},"wind":{"chill":"37","direction":"245","speed":"4"},"atmosphere":{"humidity":"78","pressure":"1018.0","rising":"0","visibility":"16.1"},"astronomy":{"sunrise":"7:19 am","sunset":"4:54 pm"},"image":{"title":"Yahoo! Weather","width":"142","height":"18","link":"http://weather.yahoo.com","url":"http://l.yimg.com/a/i/brand/purplelogo//uh/us/news-wea.gif"},"item":{"title":"Conditions for Sunnyvale, CA, US at 06:00 AM PST","lat":"37.371609","long":"-122.038254","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/","pubDate":"Tue, 20 Dec 2016 06:00 AM PST","condition":{"code":"29","date":"Tue, 20 Dec 2016 06:00 AM PST","temp":"38","text":"Partly Cloudy"},"forecast":[{"code":"30","date":"20 Dec 2016","day":"Tue","high":"56","low":"37","text":"Partly Cloudy"},{"code":"32","date":"21 Dec 2016","day":"Wed","high":"59","low":"43","text":"Sunny"},{"code":"30","date":"22 Dec 2016","day":"Thu","high":"58","low":"44","text":"Partly Cloudy"},{"code":"39","date":"23 Dec 2016","day":"Fri","high":"53","low":"46","text":"Scattered Showers"},{"code":"34","date":"24 Dec 2016","day":"Sat","high":"52","low":"43","text":"Mostly Sunny"},{"code":"30","date":"25 Dec 2016","day":"Sun","high":"51","low":"42","text":"Partly Cloudy"},{"code":"28","date":"26 Dec 2016","day":"Mon","high":"52","low":"45","text":"Mostly Cloudy"},{"code":"30","date":"27 Dec 2016","day":"Tue","high":"52","low":"45","text":"Partly Cloudy"},{"code":"30","date":"28 Dec 2016","day":"Wed","high":"53","low":"47","text":"Partly Cloudy"},{"code":"30","date":"29 Dec 2016","day":"Thu","high":"54","low":"44","text":"Partly Cloudy"}],"description":"<![CDATA[<img src=\"http://l.yimg.com/a/i/us/we/52/29.gif\"/>\n<BR />\n<b>Current Conditions:<\/b>\n<BR />Partly Cloudy\n<BR />\n<BR />\n<b>Forecast:<\/b>\n<BR /> Tue - Partly Cloudy. High: 56Low: 37\n<BR /> Wed - Sunny. High: 59Low: 43\n<BR /> Thu - Partly Cloudy. High: 58Low: 44\n<BR /> Fri - Scattered Showers. High: 53Low: 46\n<BR /> Sat - Mostly Sunny. High: 52Low: 43\n<BR />\n<BR />\n<a href=\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/\">Full Forecast at Yahoo! Weather<\/a>\n<BR />\n<BR />\n(provided by <a href=\"http://www.weather.com\" >The Weather Channel<\/a>)\n<BR />\n]]>","guid":{"isPermaLink":"false"}}}}}
     */

    @SerializedName("query")
    private Query query;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public static class Query {
        /**
         * count : 1
         * created : 2016-12-20T14:51:21Z
         * lang : en-US
         * results : {"channel":{"units":{"distance":"mi","pressure":"in","speed":"mph","temperature":"F"},"title":"Yahoo! Weather - Sunnyvale, CA, US","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/","description":"Yahoo! Weather for Sunnyvale, CA, US","language":"en-us","lastBuildDate":"Tue, 20 Dec 2016 06:51 AM PST","ttl":"60","location":{"city":"Sunnyvale","country":"United States","region":" CA"},"wind":{"chill":"37","direction":"245","speed":"4"},"atmosphere":{"humidity":"78","pressure":"1018.0","rising":"0","visibility":"16.1"},"astronomy":{"sunrise":"7:19 am","sunset":"4:54 pm"},"image":{"title":"Yahoo! Weather","width":"142","height":"18","link":"http://weather.yahoo.com","url":"http://l.yimg.com/a/i/brand/purplelogo//uh/us/news-wea.gif"},"item":{"title":"Conditions for Sunnyvale, CA, US at 06:00 AM PST","lat":"37.371609","long":"-122.038254","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/","pubDate":"Tue, 20 Dec 2016 06:00 AM PST","condition":{"code":"29","date":"Tue, 20 Dec 2016 06:00 AM PST","temp":"38","text":"Partly Cloudy"},"forecast":[{"code":"30","date":"20 Dec 2016","day":"Tue","high":"56","low":"37","text":"Partly Cloudy"},{"code":"32","date":"21 Dec 2016","day":"Wed","high":"59","low":"43","text":"Sunny"},{"code":"30","date":"22 Dec 2016","day":"Thu","high":"58","low":"44","text":"Partly Cloudy"},{"code":"39","date":"23 Dec 2016","day":"Fri","high":"53","low":"46","text":"Scattered Showers"},{"code":"34","date":"24 Dec 2016","day":"Sat","high":"52","low":"43","text":"Mostly Sunny"},{"code":"30","date":"25 Dec 2016","day":"Sun","high":"51","low":"42","text":"Partly Cloudy"},{"code":"28","date":"26 Dec 2016","day":"Mon","high":"52","low":"45","text":"Mostly Cloudy"},{"code":"30","date":"27 Dec 2016","day":"Tue","high":"52","low":"45","text":"Partly Cloudy"},{"code":"30","date":"28 Dec 2016","day":"Wed","high":"53","low":"47","text":"Partly Cloudy"},{"code":"30","date":"29 Dec 2016","day":"Thu","high":"54","low":"44","text":"Partly Cloudy"}],"description":"<![CDATA[<img src=\"http://l.yimg.com/a/i/us/we/52/29.gif\"/>\n<BR />\n<b>Current Conditions:<\/b>\n<BR />Partly Cloudy\n<BR />\n<BR />\n<b>Forecast:<\/b>\n<BR /> Tue - Partly Cloudy. High: 56Low: 37\n<BR /> Wed - Sunny. High: 59Low: 43\n<BR /> Thu - Partly Cloudy. High: 58Low: 44\n<BR /> Fri - Scattered Showers. High: 53Low: 46\n<BR /> Sat - Mostly Sunny. High: 52Low: 43\n<BR />\n<BR />\n<a href=\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/\">Full Forecast at Yahoo! Weather<\/a>\n<BR />\n<BR />\n(provided by <a href=\"http://www.weather.com\" >The Weather Channel<\/a>)\n<BR />\n]]>","guid":{"isPermaLink":"false"}}}}
         */

        @SerializedName("count")
        private int count;
        @SerializedName("created")
        private String created;
        @SerializedName("lang")
        private String lang;
        @SerializedName("results")
        private Results results;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public Results getResults() {
            return results;
        }

        public void setResults(Results results) {
            this.results = results;
        }

        public static class Results {
            /**
             * channel : {"units":{"distance":"mi","pressure":"in","speed":"mph","temperature":"F"},"title":"Yahoo! Weather - Sunnyvale, CA, US","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/","description":"Yahoo! Weather for Sunnyvale, CA, US","language":"en-us","lastBuildDate":"Tue, 20 Dec 2016 06:51 AM PST","ttl":"60","location":{"city":"Sunnyvale","country":"United States","region":" CA"},"wind":{"chill":"37","direction":"245","speed":"4"},"atmosphere":{"humidity":"78","pressure":"1018.0","rising":"0","visibility":"16.1"},"astronomy":{"sunrise":"7:19 am","sunset":"4:54 pm"},"image":{"title":"Yahoo! Weather","width":"142","height":"18","link":"http://weather.yahoo.com","url":"http://l.yimg.com/a/i/brand/purplelogo//uh/us/news-wea.gif"},"item":{"title":"Conditions for Sunnyvale, CA, US at 06:00 AM PST","lat":"37.371609","long":"-122.038254","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/","pubDate":"Tue, 20 Dec 2016 06:00 AM PST","condition":{"code":"29","date":"Tue, 20 Dec 2016 06:00 AM PST","temp":"38","text":"Partly Cloudy"},"forecast":[{"code":"30","date":"20 Dec 2016","day":"Tue","high":"56","low":"37","text":"Partly Cloudy"},{"code":"32","date":"21 Dec 2016","day":"Wed","high":"59","low":"43","text":"Sunny"},{"code":"30","date":"22 Dec 2016","day":"Thu","high":"58","low":"44","text":"Partly Cloudy"},{"code":"39","date":"23 Dec 2016","day":"Fri","high":"53","low":"46","text":"Scattered Showers"},{"code":"34","date":"24 Dec 2016","day":"Sat","high":"52","low":"43","text":"Mostly Sunny"},{"code":"30","date":"25 Dec 2016","day":"Sun","high":"51","low":"42","text":"Partly Cloudy"},{"code":"28","date":"26 Dec 2016","day":"Mon","high":"52","low":"45","text":"Mostly Cloudy"},{"code":"30","date":"27 Dec 2016","day":"Tue","high":"52","low":"45","text":"Partly Cloudy"},{"code":"30","date":"28 Dec 2016","day":"Wed","high":"53","low":"47","text":"Partly Cloudy"},{"code":"30","date":"29 Dec 2016","day":"Thu","high":"54","low":"44","text":"Partly Cloudy"}],"description":"<![CDATA[<img src=\"http://l.yimg.com/a/i/us/we/52/29.gif\"/>\n<BR />\n<b>Current Conditions:<\/b>\n<BR />Partly Cloudy\n<BR />\n<BR />\n<b>Forecast:<\/b>\n<BR /> Tue - Partly Cloudy. High: 56Low: 37\n<BR /> Wed - Sunny. High: 59Low: 43\n<BR /> Thu - Partly Cloudy. High: 58Low: 44\n<BR /> Fri - Scattered Showers. High: 53Low: 46\n<BR /> Sat - Mostly Sunny. High: 52Low: 43\n<BR />\n<BR />\n<a href=\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/\">Full Forecast at Yahoo! Weather<\/a>\n<BR />\n<BR />\n(provided by <a href=\"http://www.weather.com\" >The Weather Channel<\/a>)\n<BR />\n]]>","guid":{"isPermaLink":"false"}}}
             */

            @SerializedName("channel")
            private Channel channel;

            public Channel getChannel() {
                return channel;
            }

            public void setChannel(Channel channel) {
                this.channel = channel;
            }

            public static class Channel {
                /**
                 * units : {"distance":"mi","pressure":"in","speed":"mph","temperature":"F"}
                 * title : Yahoo! Weather - Sunnyvale, CA, US
                 * link : http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/
                 * description : Yahoo! Weather for Sunnyvale, CA, US
                 * language : en-us
                 * lastBuildDate : Tue, 20 Dec 2016 06:51 AM PST
                 * ttl : 60
                 * location : {"city":"Sunnyvale","country":"United States","region":" CA"}
                 * wind : {"chill":"37","direction":"245","speed":"4"}
                 * atmosphere : {"humidity":"78","pressure":"1018.0","rising":"0","visibility":"16.1"}
                 * astronomy : {"sunrise":"7:19 am","sunset":"4:54 pm"}
                 * image : {"title":"Yahoo! Weather","width":"142","height":"18","link":"http://weather.yahoo.com","url":"http://l.yimg.com/a/i/brand/purplelogo//uh/us/news-wea.gif"}
                 * item : {"title":"Conditions for Sunnyvale, CA, US at 06:00 AM PST","lat":"37.371609","long":"-122.038254","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/","pubDate":"Tue, 20 Dec 2016 06:00 AM PST","condition":{"code":"29","date":"Tue, 20 Dec 2016 06:00 AM PST","temp":"38","text":"Partly Cloudy"},"forecast":[{"code":"30","date":"20 Dec 2016","day":"Tue","high":"56","low":"37","text":"Partly Cloudy"},{"code":"32","date":"21 Dec 2016","day":"Wed","high":"59","low":"43","text":"Sunny"},{"code":"30","date":"22 Dec 2016","day":"Thu","high":"58","low":"44","text":"Partly Cloudy"},{"code":"39","date":"23 Dec 2016","day":"Fri","high":"53","low":"46","text":"Scattered Showers"},{"code":"34","date":"24 Dec 2016","day":"Sat","high":"52","low":"43","text":"Mostly Sunny"},{"code":"30","date":"25 Dec 2016","day":"Sun","high":"51","low":"42","text":"Partly Cloudy"},{"code":"28","date":"26 Dec 2016","day":"Mon","high":"52","low":"45","text":"Mostly Cloudy"},{"code":"30","date":"27 Dec 2016","day":"Tue","high":"52","low":"45","text":"Partly Cloudy"},{"code":"30","date":"28 Dec 2016","day":"Wed","high":"53","low":"47","text":"Partly Cloudy"},{"code":"30","date":"29 Dec 2016","day":"Thu","high":"54","low":"44","text":"Partly Cloudy"}],"description":"<![CDATA[<img src=\"http://l.yimg.com/a/i/us/we/52/29.gif\"/>\n<BR />\n<b>Current Conditions:<\/b>\n<BR />Partly Cloudy\n<BR />\n<BR />\n<b>Forecast:<\/b>\n<BR /> Tue - Partly Cloudy. High: 56Low: 37\n<BR /> Wed - Sunny. High: 59Low: 43\n<BR /> Thu - Partly Cloudy. High: 58Low: 44\n<BR /> Fri - Scattered Showers. High: 53Low: 46\n<BR /> Sat - Mostly Sunny. High: 52Low: 43\n<BR />\n<BR />\n<a href=\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/\">Full Forecast at Yahoo! Weather<\/a>\n<BR />\n<BR />\n(provided by <a href=\"http://www.weather.com\" >The Weather Channel<\/a>)\n<BR />\n]]>","guid":{"isPermaLink":"false"}}
                 */

                @SerializedName("units")
                private Units units;
                @SerializedName("title")
                private String title;
                @SerializedName("link")
                private String link;
                @SerializedName("description")
                private String description;
                @SerializedName("language")
                private String language;
                @SerializedName("lastBuildDate")
                private String lastBuildDate;
                @SerializedName("ttl")
                private String ttl;
                @SerializedName("location")
                private Location location;
                @SerializedName("wind")
                private Wind wind;
                @SerializedName("atmosphere")
                private Atmosphere atmosphere;
                @SerializedName("astronomy")
                private Astronomy astronomy;
                @SerializedName("image")
                private Image image;
                @SerializedName("item")
                private Item item;

                public Units getUnits() {
                    return units;
                }

                public void setUnits(Units units) {
                    this.units = units;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getLanguage() {
                    return language;
                }

                public void setLanguage(String language) {
                    this.language = language;
                }

                public String getLastBuildDate() {
                    return lastBuildDate;
                }

                public void setLastBuildDate(String lastBuildDate) {
                    this.lastBuildDate = lastBuildDate;
                }

                public String getTtl() {
                    return ttl;
                }

                public void setTtl(String ttl) {
                    this.ttl = ttl;
                }

                public Location getLocation() {
                    return location;
                }

                public void setLocation(Location location) {
                    this.location = location;
                }

                public Wind getWind() {
                    return wind;
                }

                public void setWind(Wind wind) {
                    this.wind = wind;
                }

                public Atmosphere getAtmosphere() {
                    return atmosphere;
                }

                public void setAtmosphere(Atmosphere atmosphere) {
                    this.atmosphere = atmosphere;
                }

                public Astronomy getAstronomy() {
                    return astronomy;
                }

                public void setAstronomy(Astronomy astronomy) {
                    this.astronomy = astronomy;
                }

                public Image getImage() {
                    return image;
                }

                public void setImage(Image image) {
                    this.image = image;
                }

                public Item getItem() {
                    return item;
                }

                public void setItem(Item item) {
                    this.item = item;
                }

                public static class Units {
                    /**
                     * distance : mi
                     * pressure : in
                     * speed : mph
                     * temperature : F
                     */

                    @SerializedName("distance")
                    private String distance;
                    @SerializedName("pressure")
                    private String pressure;
                    @SerializedName("speed")
                    private String speed;
                    @SerializedName("temperature")
                    private String temperature;

                    public String getDistance() {
                        return distance;
                    }

                    public void setDistance(String distance) {
                        this.distance = distance;
                    }

                    public String getPressure() {
                        return pressure;
                    }

                    public void setPressure(String pressure) {
                        this.pressure = pressure;
                    }

                    public String getSpeed() {
                        return speed;
                    }

                    public void setSpeed(String speed) {
                        this.speed = speed;
                    }

                    public String getTemperature() {
                        return temperature;
                    }

                    public void setTemperature(String temperature) {
                        this.temperature = temperature;
                    }
                }

                public static class Location {
                    /**
                     * city : Sunnyvale
                     * country : United States
                     * region :  CA
                     */

                    @SerializedName("city")
                    private String city;
                    @SerializedName("country")
                    private String country;
                    @SerializedName("region")
                    private String region;

                    public String getCity() {
                        return city;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public String getCountry() {
                        return country;
                    }

                    public void setCountry(String country) {
                        this.country = country;
                    }

                    public String getRegion() {
                        return region;
                    }

                    public void setRegion(String region) {
                        this.region = region;
                    }
                }

                public static class Wind {
                    /**
                     * chill : 37
                     * direction : 245
                     * speed : 4
                     */

                    @SerializedName("chill")
                    private String chill;
                    @SerializedName("direction")
                    private String direction;
                    @SerializedName("speed")
                    private String speed;

                    public String getChill() {
                        return chill;
                    }

                    public void setChill(String chill) {
                        this.chill = chill;
                    }

                    public String getDirection() {
                        return direction;
                    }

                    public void setDirection(String direction) {
                        this.direction = direction;
                    }

                    public String getSpeed() {
                        return speed;
                    }

                    public void setSpeed(String speed) {
                        this.speed = speed;
                    }
                }

                public static class Atmosphere {
                    /**
                     * humidity : 78
                     * pressure : 1018.0
                     * rising : 0
                     * visibility : 16.1
                     */

                    @SerializedName("humidity")
                    private String humidity;
                    @SerializedName("pressure")
                    private String pressure;
                    @SerializedName("rising")
                    private String rising;
                    @SerializedName("visibility")
                    private String visibility;

                    public String getHumidity() {
                        return humidity;
                    }

                    public void setHumidity(String humidity) {
                        this.humidity = humidity;
                    }

                    public String getPressure() {
                        return pressure;
                    }

                    public void setPressure(String pressure) {
                        this.pressure = pressure;
                    }

                    public String getRising() {
                        return rising;
                    }

                    public void setRising(String rising) {
                        this.rising = rising;
                    }

                    public String getVisibility() {
                        return visibility;
                    }

                    public void setVisibility(String visibility) {
                        this.visibility = visibility;
                    }
                }

                public static class Astronomy {
                    /**
                     * sunrise : 7:19 am
                     * sunset : 4:54 pm
                     */

                    @SerializedName("sunrise")
                    private String sunrise;
                    @SerializedName("sunset")
                    private String sunset;

                    public String getSunrise() {
                        return sunrise;
                    }

                    public void setSunrise(String sunrise) {
                        this.sunrise = sunrise;
                    }

                    public String getSunset() {
                        return sunset;
                    }

                    public void setSunset(String sunset) {
                        this.sunset = sunset;
                    }
                }

                public static class Image {
                    /**
                     * title : Yahoo! Weather
                     * width : 142
                     * height : 18
                     * link : http://weather.yahoo.com
                     * url : http://l.yimg.com/a/i/brand/purplelogo//uh/us/news-wea.gif
                     */

                    @SerializedName("title")
                    private String title;
                    @SerializedName("width")
                    private String width;
                    @SerializedName("height")
                    private String height;
                    @SerializedName("link")
                    private String link;
                    @SerializedName("url")
                    private String url;

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public String getLink() {
                        return link;
                    }

                    public void setLink(String link) {
                        this.link = link;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }

                public static class Item {
                    /**
                     * title : Conditions for Sunnyvale, CA, US at 06:00 AM PST
                     * lat : 37.371609
                     * long : -122.038254
                     * link : http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/
                     * pubDate : Tue, 20 Dec 2016 06:00 AM PST
                     * condition : {"code":"29","date":"Tue, 20 Dec 2016 06:00 AM PST","temp":"38","text":"Partly Cloudy"}
                     * forecast : [{"code":"30","date":"20 Dec 2016","day":"Tue","high":"56","low":"37","text":"Partly Cloudy"},{"code":"32","date":"21 Dec 2016","day":"Wed","high":"59","low":"43","text":"Sunny"},{"code":"30","date":"22 Dec 2016","day":"Thu","high":"58","low":"44","text":"Partly Cloudy"},{"code":"39","date":"23 Dec 2016","day":"Fri","high":"53","low":"46","text":"Scattered Showers"},{"code":"34","date":"24 Dec 2016","day":"Sat","high":"52","low":"43","text":"Mostly Sunny"},{"code":"30","date":"25 Dec 2016","day":"Sun","high":"51","low":"42","text":"Partly Cloudy"},{"code":"28","date":"26 Dec 2016","day":"Mon","high":"52","low":"45","text":"Mostly Cloudy"},{"code":"30","date":"27 Dec 2016","day":"Tue","high":"52","low":"45","text":"Partly Cloudy"},{"code":"30","date":"28 Dec 2016","day":"Wed","high":"53","low":"47","text":"Partly Cloudy"},{"code":"30","date":"29 Dec 2016","day":"Thu","high":"54","low":"44","text":"Partly Cloudy"}]
                     * description : <![CDATA[<img src="http://l.yimg.com/a/i/us/we/52/29.gif"/>
                     * <BR />
                     * <b>Current Conditions:</b>
                     * <BR />Partly Cloudy
                     * <BR />
                     * <BR />
                     * <b>Forecast:</b>
                     * <BR /> Tue - Partly Cloudy. High: 56Low: 37
                     * <BR /> Wed - Sunny. High: 59Low: 43
                     * <BR /> Thu - Partly Cloudy. High: 58Low: 44
                     * <BR /> Fri - Scattered Showers. High: 53Low: 46
                     * <BR /> Sat - Mostly Sunny. High: 52Low: 43
                     * <BR />
                     * <BR />
                     * <a href="http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2502265/">Full Forecast at Yahoo! Weather</a>
                     * <BR />
                     * <BR />
                     * (provided by <a href="http://www.weather.com" >The Weather Channel</a>)
                     * <BR />
                     * ]]>
                     * guid : {"isPermaLink":"false"}
                     */

                    @SerializedName("title")
                    private String title;
                    @SerializedName("lat")
                    private String lat;
                    @SerializedName("long")
                    private String longX;
                    @SerializedName("link")
                    private String link;
                    @SerializedName("pubDate")
                    private String pubDate;
                    @SerializedName("condition")
                    private Condition condition;
                    @SerializedName("description")
                    private String description;
                    @SerializedName("guid")
                    private Guid guid;
                    @SerializedName("forecast")
                    private List<Forecast> forecast;

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getLat() {
                        return lat;
                    }

                    public void setLat(String lat) {
                        this.lat = lat;
                    }

                    public String getLongX() {
                        return longX;
                    }

                    public void setLongX(String longX) {
                        this.longX = longX;
                    }

                    public String getLink() {
                        return link;
                    }

                    public void setLink(String link) {
                        this.link = link;
                    }

                    public String getPubDate() {
                        return pubDate;
                    }

                    public void setPubDate(String pubDate) {
                        this.pubDate = pubDate;
                    }

                    public Condition getCondition() {
                        return condition;
                    }

                    public void setCondition(Condition condition) {
                        this.condition = condition;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public Guid getGuid() {
                        return guid;
                    }

                    public void setGuid(Guid guid) {
                        this.guid = guid;
                    }

                    public List<Forecast> getForecast() {
                        return forecast;
                    }

                    public void setForecast(List<Forecast> forecast) {
                        this.forecast = forecast;
                    }

                    public static class Condition {
                        /**
                         * code : 29
                         * date : Tue, 20 Dec 2016 06:00 AM PST
                         * temp : 38
                         * text : Partly Cloudy
                         */

                        @SerializedName("code")
                        private String code;
                        @SerializedName("date")
                        private String date;
                        @SerializedName("temp")
                        private String temp;
                        @SerializedName("text")
                        private String text;

                        public String getCode() {
                            return code;
                        }

                        public void setCode(String code) {
                            this.code = code;
                        }

                        public String getDate() {
                            return date;
                        }

                        public void setDate(String date) {
                            this.date = date;
                        }

                        public String getTemp() {
                            return temp;
                        }

                        public void setTemp(String temp) {
                            this.temp = temp;
                        }

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }
                    }

                    public static class Guid {
                        /**
                         * isPermaLink : false
                         */

                        @SerializedName("isPermaLink")
                        private String isPermaLink;

                        public String getIsPermaLink() {
                            return isPermaLink;
                        }

                        public void setIsPermaLink(String isPermaLink) {
                            this.isPermaLink = isPermaLink;
                        }
                    }

                    public static class Forecast {
                        /**
                         * code : 30
                         * date : 20 Dec 2016
                         * day : Tue
                         * high : 56
                         * low : 37
                         * text : Partly Cloudy
                         */

                        @SerializedName("code")
                        private String code;
                        @SerializedName("date")
                        private String date;
                        @SerializedName("day")
                        private String day;
                        @SerializedName("high")
                        private String high;
                        @SerializedName("low")
                        private String low;
                        @SerializedName("text")
                        private String text;

                        public String getCode() {
                            return code;
                        }

                        public void setCode(String code) {
                            this.code = code;
                        }

                        public String getDate() {
                            return date;
                        }

                        public void setDate(String date) {
                            this.date = date;
                        }

                        public String getDay() {
                            return day;
                        }

                        public void setDay(String day) {
                            this.day = day;
                        }

                        public String getHigh() {
                            return high;
                        }

                        public void setHigh(String high) {
                            this.high = high;
                        }

                        public String getLow() {
                            return low;
                        }

                        public void setLow(String low) {
                            this.low = low;
                        }

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }
                    }
                }
            }
        }
    }
}

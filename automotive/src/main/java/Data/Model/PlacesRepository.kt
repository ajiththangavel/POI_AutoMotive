package Data.Model

class PlacesRepository {
    fun getPlaces() : List<Places>{
        return PLACES
    }
    fun getPlace(placeID : Int) : Places? {
        return PLACES.find{it.Id == placeID}
    }
}

var PLACES = listOf(
    // Create POI objects and add them to the list
    Places(
        0
        ,"The Morgan Library & Museum"
        ,40.749226
        ,-73.981397
        ,"The Morgan Library & Museum – formerly the Pierpont Morgan Library – is a museum and research library located at 225 Madison Avenue at East 36th Street in the Murray Hill neighborhood of Manhattan, New York City. It was founded to house the private library of J. P. Morgan in 1906, which included manuscripts and printed books, some of them in rare bindings, as well as his collection of prints and drawings. The library was designed by Charles McKim of the firm of McKim, Mead and White and cost \$1.2 million. It was made a public institution in 1924 by J. P. Morgan's son John Pierpont Morgan, Jr., in accordance with his father's will."
        ,17
        ,"29 E 36th St, New York, NY 10016, USA"
        ,"Museum.jpeg"
        ,"09:00-18:00"
        ,25)
    ,Places(
        1
        ,"Jefferson Market Library"
        ,40.734587
        ,-73.999163
        ,"The Jefferson Market Branch, New York Public Library, once known as the Jefferson Market Courthouse, is located at 425 Avenue of the Americas (Sixth Avenue), on the southwest corner of West 10th Street, in Greenwich Village, Manhattan, New York City, on a triangular plot formed by Greenwich Avenue and West 10th Street. It was originally built as the Third Judicial District Courthouse from 1874 to 1877, and was designed by architect Frederick Clarke Withers of the firm of Vaux and Withers."
        ,17
        ,"425 6th Ave, New York, NY 10011, USA"
        ,"Museum.jpeg"
        ,"09:00-18:00"
        ,25)
    ,Places(
        2
        ,"New York Public Library - Bloomingdale Library"
        ,	40.795864
        ,-73.967619
        ,"The latitude of New York Public Library - Bloomingdale Library is 40.795864, and the longitude is -73.967619. New York Public Library - Bloomingdale Library is located in New York City, United States with the gps coordinates of 40° 47' 45.1104'' N and 73° 58' 3.4284'' W. The category of New York Public Library - Bloomingdale Library is Libraries."
        ,17
        ,"425 6th Ave, New York, NY 10011, USA"
        ,"Museum.jpeg"
        ,"09:00-18:00"
        ,25)
    ,Places(
        3
        ," Newberry Library"
        ,	41.900043
        ,-87.630617
        ,"The Newberry Library is an independent research library, specializing in the humanities and located in Chicago, Illinois, that has been free and open to the public since 1887. Its collections encompass a variety of topics related to the history and cultural production of Western Europe and the Americas over the last six centuries. Core collection strengths support research in several subject areas, including maps, travel, and exploration; music from the Renaissance to the early twentieth century; early contact between Western colonizers and Indigenous peoples in the Western Hemisphere; the personal papers of twentieth-century American journalists; the history of printing; and genealogy and local history. Although the Newberry is a noncirculating library, it welcomes researchers into the reading rooms who are at least 14 years old or in the ninth grade, and has a research topic corresponding to the nature of the collections. Additional public services are offered through exhibitions, meet-the-author lectures, adult education seminars, and other programming."
        ,17
        ,"425 6th Ave, New York, NY 10011, USA"
        ,"Museum.jpeg"
        ,"09:00-18:00"
        ,25)
    ,Places(
        4
        ,"Pritzker Military Museum & Library"
        ,	41.880612
        ,-87.624912
        ,"The Pritzker Military Museum & Library (formerly Pritzker Military Library) is a museum and a research library for the study of military history in Chicago, Illinois, US. It was founded in 2003 by Colonel (IL) Jennifer N. Pritzker, IL ARNG (Ret.), then known as James Pritzker, to be a non-partisan institution for the study of \"the citizen soldier as an essential element for the preservation of democracy\". Originally located in the Streeterville neighborhood at 610 N. Fairbanks Court, the library later moved to 104 S. Michigan Avenue in the Loop. The Museum & Library is supported by donations and membership"
        ,17
        ,"425 6th Ave, New York, NY 10011, USA"
        ,"Museum.jpeg"
        ,"09:00-18:00"
        ,25)


)
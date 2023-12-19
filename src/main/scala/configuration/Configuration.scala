package configuration

import org.http4s.Uri

import scala.concurrent.duration.FiniteDuration

case class Configuration(
                          refreshInterval: FiniteDuration,
                          sonarrBaseUrl: Uri,
                          sonarrApiKey: String,
                          sonarrQualityProfileId: Int,
                          sonarrRootFolder: String,
                          sonarrBypassIgnored: Boolean,
                          sonarrSeasonMonitoring: String,
                          sonarrLanguageProfileId: Int,
                          radarrBaseUrl: Uri,
                          radarrApiKey: String,
                          radarrQualityProfileId: Int,
                          radarrRootFolder: String,
                          radarrBypassIgnored: Boolean,
                          plexWatchlistUrls: Set[Uri],
                          plexTokens: Set[String],
                          skipFriendSync: Boolean
                        )

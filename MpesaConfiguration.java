@Data
@Configuration
@ConfigurationProperties(prefix = "mpesa.daraja")
public class MpesaConfiguration {
  private String consumerKey;
  private String consumerSecret;
  private String grantType;
  private String oauthEndpoint;
  @Override
  public String toString() {
    return String.format("{consumer key = '%',grant Type = '%',oauthEndpoint = '%'}",consumerKey,consumerSecret,
                         grantType,,oauthEndpoint);
  }
}

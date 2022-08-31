public class AccessTokenResponse {
  @JsonProperty("access_token")
  @JSonProperty("expiresIn")
  private String expiresIn;
  @SneakyThrows
  @Override
  public String toString() {
    return new ObjectMapper().writeValueAsString(this);
  }
}

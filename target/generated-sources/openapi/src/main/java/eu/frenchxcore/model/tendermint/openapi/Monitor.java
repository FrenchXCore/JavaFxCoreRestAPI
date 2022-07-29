/*
 * Tendermint RPC
 * Tendermint supports the following RPC protocols:  * URI over HTTP * JSON-RPC 2.0 over HTTP * JSON-RPC 2.0 over websockets (deprecated)  ## Configuration  RPC can be configured by tuning parameters under `[rpc]` table in the `$TMHOME/config/config.toml` file or by using the `--rpc.X` command-line flags.  Default rpc listen address is `tcp://0.0.0.0:26657`. To set another address, set the `laddr` config parameter to desired value. CORS (Cross-Origin Resource Sharing) can be enabled by setting `cors_allowed_origins`, `cors_allowed_methods`, `cors_allowed_headers` config parameters.  ## Arguments  Arguments which expect strings or byte arrays may be passed as quoted strings, like `\"abc\"` or as `0x`-prefixed strings, like `0x616263`.  ## URI/HTTP  A GET request with arguments encoded as query parameters:      curl localhost:26657/block?height=5  ## JSONRPC/HTTP  JSONRPC requests can be POST'd to the root RPC endpoint via HTTP.      curl --header \"Content-Type: application/json\" --request POST --data '{\"method\": \"block\", \"params\": [\"5\"], \"id\": 1}' localhost:26657  ## JSONRPC/websockets  In Tendermint v0.35 and earlier, JSONRPC requests can be also made via websocket.  The websocket interface is deprecated in Tendermint v0.36, and will be removed in v0.37.  The websocket endpoint is at `/websocket`, e.g. `localhost:26657/websocket`. The RPC methods for event subscription (`subscribe`, `unsubscribe`, and `unsubscribe_all`) are only available via websockets.  Example using https://github.com/hashrocket/ws:      ws ws://localhost:26657/websocket     > { \"jsonrpc\": \"2.0\", \"method\": \"subscribe\", \"params\": [\"tm.event='NewBlock'\"], \"id\": 1 } 
 *
 * The version of the OpenAPI document: Master
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eu.frenchxcore.model.tendermint.openapi;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Monitor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T09:44:07.698929500+02:00[Europe/Paris]")
public class Monitor {
  public static final String SERIALIZED_NAME_ACTIVE = "Active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_START = "Start";
  @SerializedName(SERIALIZED_NAME_START)
  private String start;

  public static final String SERIALIZED_NAME_DURATION = "Duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_IDLE = "Idle";
  @SerializedName(SERIALIZED_NAME_IDLE)
  private String idle;

  public static final String SERIALIZED_NAME_BYTES = "Bytes";
  @SerializedName(SERIALIZED_NAME_BYTES)
  private String bytes;

  public static final String SERIALIZED_NAME_SAMPLES = "Samples";
  @SerializedName(SERIALIZED_NAME_SAMPLES)
  private String samples;

  public static final String SERIALIZED_NAME_INST_RATE = "InstRate";
  @SerializedName(SERIALIZED_NAME_INST_RATE)
  private String instRate;

  public static final String SERIALIZED_NAME_CUR_RATE = "CurRate";
  @SerializedName(SERIALIZED_NAME_CUR_RATE)
  private String curRate;

  public static final String SERIALIZED_NAME_AVG_RATE = "AvgRate";
  @SerializedName(SERIALIZED_NAME_AVG_RATE)
  private String avgRate;

  public static final String SERIALIZED_NAME_PEAK_RATE = "PeakRate";
  @SerializedName(SERIALIZED_NAME_PEAK_RATE)
  private String peakRate;

  public static final String SERIALIZED_NAME_BYTES_REM = "BytesRem";
  @SerializedName(SERIALIZED_NAME_BYTES_REM)
  private String bytesRem;

  public static final String SERIALIZED_NAME_TIME_REM = "TimeRem";
  @SerializedName(SERIALIZED_NAME_TIME_REM)
  private String timeRem;

  public static final String SERIALIZED_NAME_PROGRESS = "Progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private Integer progress;


  public Monitor active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Monitor start(String start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-07-31T14:31:28.66Z", value = "")

  public String getStart() {
    return start;
  }


  public void setStart(String start) {
    this.start = start;
  }


  public Monitor duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "168901060000000", value = "")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public Monitor idle(String idle) {
    
    this.idle = idle;
    return this;
  }

   /**
   * Get idle
   * @return idle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "168901040000000", value = "")

  public String getIdle() {
    return idle;
  }


  public void setIdle(String idle) {
    this.idle = idle;
  }


  public Monitor bytes(String bytes) {
    
    this.bytes = bytes;
    return this;
  }

   /**
   * Get bytes
   * @return bytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public String getBytes() {
    return bytes;
  }


  public void setBytes(String bytes) {
    this.bytes = bytes;
  }


  public Monitor samples(String samples) {
    
    this.samples = samples;
    return this;
  }

   /**
   * Get samples
   * @return samples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public String getSamples() {
    return samples;
  }


  public void setSamples(String samples) {
    this.samples = samples;
  }


  public Monitor instRate(String instRate) {
    
    this.instRate = instRate;
    return this;
  }

   /**
   * Get instRate
   * @return instRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public String getInstRate() {
    return instRate;
  }


  public void setInstRate(String instRate) {
    this.instRate = instRate;
  }


  public Monitor curRate(String curRate) {
    
    this.curRate = curRate;
    return this;
  }

   /**
   * Get curRate
   * @return curRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public String getCurRate() {
    return curRate;
  }


  public void setCurRate(String curRate) {
    this.curRate = curRate;
  }


  public Monitor avgRate(String avgRate) {
    
    this.avgRate = avgRate;
    return this;
  }

   /**
   * Get avgRate
   * @return avgRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public String getAvgRate() {
    return avgRate;
  }


  public void setAvgRate(String avgRate) {
    this.avgRate = avgRate;
  }


  public Monitor peakRate(String peakRate) {
    
    this.peakRate = peakRate;
    return this;
  }

   /**
   * Get peakRate
   * @return peakRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public String getPeakRate() {
    return peakRate;
  }


  public void setPeakRate(String peakRate) {
    this.peakRate = peakRate;
  }


  public Monitor bytesRem(String bytesRem) {
    
    this.bytesRem = bytesRem;
    return this;
  }

   /**
   * Get bytesRem
   * @return bytesRem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public String getBytesRem() {
    return bytesRem;
  }


  public void setBytesRem(String bytesRem) {
    this.bytesRem = bytesRem;
  }


  public Monitor timeRem(String timeRem) {
    
    this.timeRem = timeRem;
    return this;
  }

   /**
   * Get timeRem
   * @return timeRem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public String getTimeRem() {
    return timeRem;
  }


  public void setTimeRem(String timeRem) {
    this.timeRem = timeRem;
  }


  public Monitor progress(Integer progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getProgress() {
    return progress;
  }


  public void setProgress(Integer progress) {
    this.progress = progress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Monitor monitor = (Monitor) o;
    return Objects.equals(this.active, monitor.active) &&
        Objects.equals(this.start, monitor.start) &&
        Objects.equals(this.duration, monitor.duration) &&
        Objects.equals(this.idle, monitor.idle) &&
        Objects.equals(this.bytes, monitor.bytes) &&
        Objects.equals(this.samples, monitor.samples) &&
        Objects.equals(this.instRate, monitor.instRate) &&
        Objects.equals(this.curRate, monitor.curRate) &&
        Objects.equals(this.avgRate, monitor.avgRate) &&
        Objects.equals(this.peakRate, monitor.peakRate) &&
        Objects.equals(this.bytesRem, monitor.bytesRem) &&
        Objects.equals(this.timeRem, monitor.timeRem) &&
        Objects.equals(this.progress, monitor.progress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, start, duration, idle, bytes, samples, instRate, curRate, avgRate, peakRate, bytesRem, timeRem, progress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Monitor {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    idle: ").append(toIndentedString(idle)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    instRate: ").append(toIndentedString(instRate)).append("\n");
    sb.append("    curRate: ").append(toIndentedString(curRate)).append("\n");
    sb.append("    avgRate: ").append(toIndentedString(avgRate)).append("\n");
    sb.append("    peakRate: ").append(toIndentedString(peakRate)).append("\n");
    sb.append("    bytesRem: ").append(toIndentedString(bytesRem)).append("\n");
    sb.append("    timeRem: ").append(toIndentedString(timeRem)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


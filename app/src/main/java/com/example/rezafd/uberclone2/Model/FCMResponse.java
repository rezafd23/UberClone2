package com.example.rezafd.uberclone2.Model;

import java.util.List;

/**
 * Created by REZAFD on 29/12/2017.
 */

public class FCMResponse {
    public long multicast_id;
    public int success;
    public int failure;
    public int canocical_ids;
    public List<Result> results;

    public FCMResponse() {

    }

    public FCMResponse(long multicast_id, int success, int failure, int canocical_ids, List<Result> results) {
        this.multicast_id = multicast_id;
        this.success = success;
        this.failure = failure;
        this.canocical_ids = canocical_ids;
        this.results = results;
    }

    public long getMulticast_id() {
        return multicast_id;
    }

    public void setMulticast_id(long multicast_id) {
        this.multicast_id = multicast_id;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getFailure() {
        return failure;
    }

    public void setFailure(int failure) {
        this.failure = failure;
    }

    public int getCanocical_ids() {
        return canocical_ids;
    }

    public void setCanocical_ids(int canocical_ids) {
        this.canocical_ids = canocical_ids;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}

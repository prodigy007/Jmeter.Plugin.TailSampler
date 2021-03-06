package ru.pflb.jmeter.samplers.wrapper;

/**
 * Created by a.perevozchikova on 29.02.2016.
 */

import org.apache.jmeter.protocol.http.sampler.HTTPHC3Impl;
import org.apache.jmeter.protocol.http.sampler.HTTPSampleResult;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerBase;
import ru.pflb.jmeter.samplers.ITailHTTPImpl;

import java.net.URL;

public class WrapperHTTPHC3Impl extends HTTPHC3Impl implements ITailHTTPImpl{


    protected WrapperHTTPHC3Impl(HTTPSamplerBase base) {
        super(base);
    }

    @Override
    protected HTTPSampleResult sample(URL url, String method, boolean areFollowingRedirect, int frameDepth) {
        return super.sample(url, method, areFollowingRedirect, frameDepth);
    }

    @Override
    public HTTPSampleResult sampleTail(URL url, String method, boolean areFollowingRedirect, int frameDepth) {
        return super.sample(url, method, areFollowingRedirect, frameDepth);
    }

    @Override
    public void notifyFirstSampleAfterLoopRestart(){
        super.notifyFirstSampleAfterLoopRestart();
    }

    @Override
    public void threadFinished() {
        super.threadFinished();
    }
}

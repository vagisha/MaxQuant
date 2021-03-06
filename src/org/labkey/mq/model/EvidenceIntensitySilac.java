package org.labkey.mq.model;

/**
 * Created by vsharma on 3/3/2016.
 */
public class EvidenceIntensitySilac extends MqEntity
{
    private int _evidenceId;
    private Long _intensity;
    private String _labelType;

    public EvidenceIntensitySilac() {}

    public int getEvidenceId()
    {
        return _evidenceId;
    }

    public void setEvidenceId(int evidenceId)
    {
        _evidenceId = evidenceId;
    }

    public Long getIntensity()
    {
        return _intensity;
    }

    public void setIntensity(Long intensity)
    {
        _intensity = intensity;
    }

    public String getLabelType()
    {
        return _labelType;
    }

    public void setLabelType(String labelType)
    {
        _labelType = labelType;
    }
}

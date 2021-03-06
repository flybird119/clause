<?php
/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

/**
 * 意图
 */
class Intent
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'chatbotID',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'id',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'description',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        5 => array(
            'var' => 'createdate',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        6 => array(
            'var' => 'updatedate',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $chatbotID = null;
    /**
     * @var string
     */
    public $name = null;
    /**
     * @var string
     */
    public $id = null;
    /**
     * @var string
     */
    public $description = null;
    /**
     * @var string
     */
    public $createdate = null;
    /**
     * @var string
     */
    public $updatedate = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['chatbotID'])) {
                $this->chatbotID = $vals['chatbotID'];
            }
            if (isset($vals['name'])) {
                $this->name = $vals['name'];
            }
            if (isset($vals['id'])) {
                $this->id = $vals['id'];
            }
            if (isset($vals['description'])) {
                $this->description = $vals['description'];
            }
            if (isset($vals['createdate'])) {
                $this->createdate = $vals['createdate'];
            }
            if (isset($vals['updatedate'])) {
                $this->updatedate = $vals['updatedate'];
            }
        }
    }

    public function getName()
    {
        return 'Intent';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->chatbotID);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->id);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->description);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->createdate);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->updatedate);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('Intent');
        if ($this->chatbotID !== null) {
            $xfer += $output->writeFieldBegin('chatbotID', TType::STRING, 1);
            $xfer += $output->writeString($this->chatbotID);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->name !== null) {
            $xfer += $output->writeFieldBegin('name', TType::STRING, 2);
            $xfer += $output->writeString($this->name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->id !== null) {
            $xfer += $output->writeFieldBegin('id', TType::STRING, 3);
            $xfer += $output->writeString($this->id);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->description !== null) {
            $xfer += $output->writeFieldBegin('description', TType::STRING, 4);
            $xfer += $output->writeString($this->description);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->createdate !== null) {
            $xfer += $output->writeFieldBegin('createdate', TType::STRING, 5);
            $xfer += $output->writeString($this->createdate);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->updatedate !== null) {
            $xfer += $output->writeFieldBegin('updatedate', TType::STRING, 6);
            $xfer += $output->writeString($this->updatedate);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
